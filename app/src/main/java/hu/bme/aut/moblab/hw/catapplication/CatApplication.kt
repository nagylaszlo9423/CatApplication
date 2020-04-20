package hu.bme.aut.moblab.hw.catapplication

import android.app.Application

class CatApplication : Application() {
    lateinit var component: CatApplicationComponent

    override fun onCreate() {
        super.onCreate()
        component = DaggerCatApplicationComponent.builder()
            .applicationModule(ApplicationModule(this))
            .build()
    }
}
