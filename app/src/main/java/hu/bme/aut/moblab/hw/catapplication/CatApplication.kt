package hu.bme.aut.moblab.hw.catapplication

import android.app.Application

class CatApplication : Application() {
    val component: CatApplicationComponent = DaggerCatApplicationComponent.builder()
        .applicationModule(ApplicationModule(this))
        .build()
}
