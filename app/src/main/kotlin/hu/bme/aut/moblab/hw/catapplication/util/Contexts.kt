package hu.bme.aut.moblab.hw.catapplication.util

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.asCoroutineDispatcher
import java.util.concurrent.Executors

object Contexts {
    val UI = Dispatchers.Main
    val NETWORK = Executors.newSingleThreadExecutor {task -> Thread(task, "NETWORK")}.asCoroutineDispatcher()
}