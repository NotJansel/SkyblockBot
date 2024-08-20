package org.hyacinthbots.allium.extensions

import dev.kordex.core.extensions.Extension
import dev.kordex.core.utils.scheduling.Scheduler
import dev.kordex.core.utils.scheduling.Task
import org.hyacinthbots.allium.utils.getRandomSplash
import kotlin.time.Duration.Companion.minutes

class PresenceUpdater : Extension() {
	override val name = "presence-updater"

	private val scheduler = Scheduler()

	private lateinit var task: Task

	override suspend fun setup() {
		task = scheduler.schedule(2.minutes, repeat = true, callback = ::updatePresence)
	}

	private suspend fun updatePresence() {
		kord.editPresence {
			playing(getRandomSplash().replace(Regex("§[0-9a-fk-or]"), ""))
		}
	}
}
