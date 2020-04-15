package hu.bme.aut.moblab.hw.catapplication.ui

import hu.bme.aut.moblab.hw.catapplication.util.Contexts
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlin.coroutines.CoroutineContext

abstract class Presenter<S> : CoroutineScope {
    protected var screen: S? = null

    var job: Job = Job()

    override val coroutineContext: CoroutineContext
        get() = Contexts.UI + job

    open fun attachScreen(screen: S) {
        this.screen = screen
    }

    open fun detachScreen() {
        this.screen = null
        job.cancel()
    }
}

