package hu.bme.aut.moblab.hw.catapplication

import androidx.test.core.app.ApplicationProvider
import org.robolectric.shadows.ShadowLog

val testInjector: TestComponent
    get() {
        ShadowLog.stream = System.out
        val application = ApplicationProvider.getApplicationContext<CatApplication>()
        val component: TestComponent = DaggerTestComponent.builder().testModule(TestModule(application)).build()
        application.component = component
        return component
    }
