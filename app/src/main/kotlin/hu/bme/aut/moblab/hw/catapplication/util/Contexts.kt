package hu.bme.aut.moblab.hw.catapplication.util

import kotlinx.coroutines.asCoroutineDispatcher
import java.util.concurrent.Executors

object Contexts {
    val NETWORK = Executors.newSingleThreadExecutor {task -> Thread(task, "NETWORK")}.asCoroutineDispatcher()
}