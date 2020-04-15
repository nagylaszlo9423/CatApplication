package hu.bme.aut.moblab.hw.catapplication.ui

import dagger.Module
import dagger.Provides
import hu.bme.aut.moblab.hw.catapplication.ui.list.CatPresenter
import hu.bme.aut.moblab.hw.catapplication.ui.list.CatsPresenter
import javax.inject.Singleton

@Module
class UIModule {

    @Provides
    @Singleton
    fun provideCatPresenter() = CatPresenter()

    @Provides
    @Singleton
    fun provideCatsPresenter() = CatsPresenter()

}