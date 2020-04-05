package hu.bme.aut.moblab.hw.catapplication.interactor

import dagger.Provides
import hu.bme.aut.moblab.hw.catapplication.interactor.cats.CatsInteractor
import hu.bme.aut.moblab.hw.catapplication.network.TheCatsApi
import javax.inject.Singleton

class InteractorModule {

    @Provides
    @Singleton
    fun providesCatsInteractor(theCatsApi: TheCatsApi) = CatsInteractor(theCatsApi)

}