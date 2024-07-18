import java.util.*

plugins {
    application

    kotlin("jvm")
    kotlin("plugin.serialization")

    id("com.github.gmazzo.buildconfig") version "3.1.0"
    id("com.github.jakemarsden.git-hooks")
    id("com.github.johnrengelman.shadow")
    id("io.gitlab.arturbosch.detekt")
    id("net.kyori.blossom") version "2.1.0"
    id("net.kyori.indra.git") version "3.1.3"
}

fun String.runCommand(
    workingDir: File = File("."),
    timeoutAmount: Long = 60,
    timeoutUnit: TimeUnit = TimeUnit.SECONDS
): String = ProcessBuilder(split("\\s(?=(?:[^'\"`]*(['\"`])[^'\"`]*\\1)*[^'\"`]*$)".toRegex()))
    .directory(workingDir)
    .redirectOutput(ProcessBuilder.Redirect.PIPE)
    .redirectError(ProcessBuilder.Redirect.PIPE)
    .start()
    .apply { waitFor(timeoutAmount, timeoutUnit) }
    .run {
        val error = errorStream.bufferedReader().readText().trim()
        if (error.isNotEmpty()) {
            throw Exception(error)
        }
        inputStream.bufferedReader().readText().trim()
    }


group = "org.hyacinthbots.allium"
version = "0.7-build.local-" + "git rev-parse --short=8 HEAD".runCommand(workingDir = rootDir) + "-" + "git branch --show-current".runCommand(workingDir = rootDir).replace("/", ".")
var buildTime = Date().time / 1000
// version = "0.6.5"
// The current LTS Java version
val javaVersion = 21

sourceSets {
    main {
        blossom {
            kotlinSources {
                property("version", project.version.toString())
                property("buildtime", buildTime.toString())
            }
        }
    }
}

repositories {
    google()
    mavenCentral()

    maven {
        name = "Sonatype Snapshots"
        url = uri("https://oss.sonatype.org/content/repositories/snapshots")
    }
    maven {
        name = "Shedaniel Maven"
        url = uri("https://maven.shedaniel.me")
    }
    maven {
        name = "Sonatype Snapshots"
        url = uri("https://s01.oss.sonatype.org/content/repositories/snapshots")
    }

    maven {
        name = "Kotlin Discord"
        url = uri("https://maven.kotlindiscord.com/repository/maven-public/")
    }

    maven {
        name = "FabricMC"
        url = uri("https://maven.fabricmc.net/")
    }

    maven {
        name = "JitPack"
        url = uri("https://jitpack.io")
    }

    maven {
        name = "QuiltMC (Releases)"
        url = uri("https://maven.quiltmc.org/repository/release/")
    }

    maven {
        name = "QuiltMC (Snapshots)"
        url = uri("https://maven.quiltmc.org/repository/snapshot/")
    }
}

dependencies {
    detektPlugins(libs.detekt)

    implementation(libs.kord.extensions.core)
    implementation(libs.kord.extensions.mappings)
    implementation(libs.kord.extensions.pluralkit)
    implementation(libs.kotlin.stdlib)
    implementation(libs.kx.ser)
    implementation(libs.kx.ser.json)
    implementation(libs.gson)
    implementation(libs.doc.gen)
    implementation(libs.kmongo)
    implementation(libs.ktor)
    implementation(libs.ktor.cio)

    // Logging dependencies
    implementation(libs.jansi)
    implementation(libs.logging)
    implementation(libs.groovy)
    implementation(libs.logback)
    implementation(libs.logback.groovy)
}

application {
    mainClass.set("org.hyacinthbots.allium.AppKt")
}

gitHooks {
    setHooks(
        mapOf("pre-commit" to "detekt")
    )
}

kotlin {
    sourceSets["main"].apply {
        kotlin.srcDir("src/main/kotlin")
    }
    jvmToolchain(javaVersion)
    compilerOptions {
        apiVersion.set(org.jetbrains.kotlin.gradle.dsl.KotlinVersion.KOTLIN_2_0)
    }
}

tasks {
    processResources {
        inputs.property("version", version)
    }

    jar {
        manifest {
            attributes(
                "Main-Class" to "org.hyacinthbots.allium.AppKt"
            )
        }
    }

    wrapper {
        /*
        Update gradle by changing `gradleVersion` below to the new version,
        then run `./gradlew wrapper` twice to update the scripts properly.
         */
        gradleVersion = "8.8"
        distributionType = Wrapper.DistributionType.BIN
    }
}

detekt {
    buildUponDefaultConfig = true
    autoCorrect = true
    config.setFrom(rootProject.files("detekt.yml"))
}
