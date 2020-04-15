import android.app.Application
import hu.bme.aut.moblab.hw.catapplication.CatApplicationComponent
import hu.bme.aut.moblab.hw.catapplication.DaggerCatApplicationComponent

class CatApplication : Application() {
    val component: CatApplicationComponent = DaggerCatApplicationComponent.create()
}
