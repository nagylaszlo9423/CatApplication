package hu.bme.aut.moblab.hw.catapplication

import android.content.Context
import dagger.Module
import dagger.Provides
import hu.bme.aut.moblab.hw.catapplication.util.Contexts
import kotlinx.coroutines.CoroutineScope

@Module
open class ApplicationModule(private val context: Context) {

    @Provides
    open fun provideContext(): Context = context

    @Provides
    fun provideCoroutineScope(): CoroutineScope = CoroutineScope(Contexts.UI)

}