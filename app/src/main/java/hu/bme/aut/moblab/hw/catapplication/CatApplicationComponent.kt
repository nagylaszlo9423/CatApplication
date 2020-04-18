package hu.bme.aut.moblab.hw.catapplication

import dagger.Component
import hu.bme.aut.moblab.hw.catapplication.db.RoomModule
import hu.bme.aut.moblab.hw.catapplication.interactor.InteractorModule
import hu.bme.aut.moblab.hw.catapplication.network.NetworkModule
import hu.bme.aut.moblab.hw.catapplication.ui.UIModule
import hu.bme.aut.moblab.hw.catapplication.ui.details.CatDetailsActivity
import hu.bme.aut.moblab.hw.catapplication.ui.list.CatsListActivity
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ApplicationModule::class,
        UIModule::class,
        NetworkModule::class,
        InteractorModule::class,
        RoomModule::class
    ]
)
interface CatApplicationComponent {
    fun inject(catDetailsActivity: CatDetailsActivity)
    fun inject(catsListActivity: CatsListActivity)
}