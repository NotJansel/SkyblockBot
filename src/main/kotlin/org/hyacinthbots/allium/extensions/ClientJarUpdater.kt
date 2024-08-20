package org.hyacinthbots.allium.extensions

import dev.kordex.core.extensions.Extension
import dev.kordex.core.utils.scheduling.Scheduler
import dev.kordex.core.utils.scheduling.Task
import org.hyacinthbots.allium.utils.downloadLatestClientJar
import kotlin.time.Duration.Companion.hours

class ClientJarUpdater : Extension() {
	override val name = "ClientJarUpdater"

	private val scheduler = Scheduler()

	private lateinit var task: Task

	override suspend fun setup() {
		task = scheduler.schedule(6.hours, repeat = true, callback = ::updateClientJar)
	}

	private suspend fun updateClientJar() {
		downloadLatestClientJar()
	}
}
