package org.hyacinthbots.allium.utils

import dev.kord.common.entity.Snowflake
import dev.kordex.core.utils.env
import dev.kordex.core.utils.envOrNull
import org.hyacinthbots.allium.internal.BuildInfo

/** Get the test server ID from the env vars or a .env file. */
val TEST_SERVER_ID = Snowflake(env("TEST_SERVER"))

/** Get the test channel ID from the env vars or a .env file. */
val TEST_SERVER_CHANNEL_ID = Snowflake(env("TEST_CHANNEL"))

/** Get the bots token from the env vars or a .env file. */
val TOKEN = env("TOKEN")

/** Get the time the bot was built on. */
const val BUILDTIME = BuildInfo.BUILDTIME

/** Get the Mongo URI for the Client to connect to. */
val MONGO_URI = envOrNull("MONGO_URI") ?: "mongodb://localhost:27017"

/** Get the CurseForge API Key. */
val CURSEFORGE_API_KEY = env("CURSEFORGE_API_KEY")

/** Get the build revision. */
var BUILD = BuildInfo.BUILD

val ENVIRONMENT = env("ENVIRONMENT")
