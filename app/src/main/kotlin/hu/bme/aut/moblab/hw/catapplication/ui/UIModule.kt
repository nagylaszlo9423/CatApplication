package hu.bme.aut.moblab.hw.catapplication.ui

import dagger.Module
import dagger.Provides
import hu.bme.aut.moblab.hw.catapplication.interactor.CatsInteractor
import hu.bme.aut.moblab.hw.catapplication.ui.list.CatPresenter
import hu.bme.aut.moblab.hw.catapplication.ui.list.CatsPresenter
import javax.inject.Singleton

@Module
class UIModule {

    @Provides
    @Singleton
    fun provideCatPresenter(
        catsInteractor: CatsInteractor
    ) = CatPresenter(catsInteractor)

    @Provides
    @Singleton
    fun provideCatsPresenter(
        catsInteractor: CatsInteractor
    ) = CatsPresenter(catsInteractor)

}