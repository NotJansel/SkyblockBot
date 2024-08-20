package org.hyacinthbots.allium

import com.google.gson.JsonArray
import com.google.gson.JsonParser
import dev.kord.core.Kord
import dev.kord.gateway.Intent
import dev.kord.gateway.PrivilegedIntent
import dev.kordex.core.ExtensibleBot
import dev.kordex.core.utils.getKoin
import dev.kordex.modules.func.mappings.extMappings
import kotlinx.coroutines.flow.count
import org.hyacinthbots.allium.extensions.*
import org.hyacinthbots.allium.utils.BUILD
import org.hyacinthbots.allium.utils.BUILDTIME
import org.hyacinthbots.allium.utils.ENVIRONMENT
import org.hyacinthbots.allium.utils.TOKEN
import org.hyacinthbots.allium.utils.database
import org.hyacinthbots.allium.utils.getRandomUpdateMessage
import org.hyacinthbots.docgenerator.docsGenerator
import org.hyacinthbots.docgenerator.enums.CommandTypes
import org.hyacinthbots.docgenerator.enums.SupportedFileFormat
import java.util.*
import kotlin.io.path.Path

var updatemessages = JsonArray()

@OptIn(PrivilegedIntent::class)
suspend fun main() {
	updatemessages = JsonParser.parseString({}.javaClass.getResource("/updatemessage.json")?.readText()).asJsonArray
	val bot = ExtensibleBot(TOKEN) {
		database(true)
		about {
			ephemeral = false
			description = "Hello! I am Allium, a Minecraft modding focused bot."
			name = "Allium"

			field {
				name = "Birthday (initial date of idea)"
				value = "September 6th, 2022"
			}
			field {
				name = " Main Developers"
				value = "Jansel"
			}
			field {
				name = "Contributors"
				value = """[Jansel](https://github.com/NotJansel)
                          |[TemperΘΔ](https://github.com/StonkDragon)
                          |[triphora](https://github.com/triphora)
                          |[NoComment](https://github.com/NoComment1105)
                          |[Scrumplex](https://github.com/Scrumplex)
                """.trimMargin()
			}
			field {
				val kord = getKoin().get<Kord>()
				name = "Guilds"
				value = kord.guilds.count().toString()
			}
			field {
				name = "Build"
				value = BUILD.toString()
			}
			field {
				name = "This build was created on:"
				value = "<t:$BUILDTIME>"
			}
			field {
				name = "Next update?"
				value = getRandomUpdateMessage()
			}

			button {
				name = "Source Code"
				url = "https://github.com/HyacinthBots/Allium"
			}
			button {
				name = "Invite"
				url =
					"https://discord.com/api/oauth2/authorize?client_id=1013045351852298280&permissions=347136&scope=bot%20applications.commands"
			}
			button {
				name = "Terms of Service"
				url = "https://github.com/HyacinthBots/.github/blob/main/terms-of-service.md"
			}
			button {
				name = "Privacy Policy"
				url = "https://github.com/HyacinthBots/Allium/tree/root/docs/privacy-policy.md"
			}
		}

		extensions {
			add(::EventHooks)
			add(::CurseForge)
			add(::Modrinth)
			add(::PresenceUpdater)
			add(::ClientJarUpdater)
			add(::StatusPing)
			add(::LogUploading)
			add(::Config)
			extMappings { }
		}
		intents {
			+Intent.MessageContent
		}
		i18n {
			defaultLocale = Locale.ENGLISH
		}
		docsGenerator {
			enabled = true
			fileFormat = SupportedFileFormat.MARKDOWN
			filePath = Path("./docs/commands.md")
			environment = ENVIRONMENT
			useBuiltinCommandList = true
			commandTypes = CommandTypes.ALL
			botName = "Allium"
		}
	}
	bot.start()
}
