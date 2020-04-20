package hu.bme.aut.moblab.hw.catapplication.interactor

import dagger.Module
import dagger.Provides
import hu.bme.aut.moblab.hw.catapplication.db.dao.CatBreedDao
import hu.bme.aut.moblab.hw.catapplication.network.CatFactsApi
import hu.bme.aut.moblab.hw.catapplication.network.TheCatsApi
import javax.inject.Singleton

@Module
class InteractorModule {

    @Provides
    @Singleton
    fun providesCatsInteractor(
        theCatsApi: TheCatsApi,
        catFactsApi: CatFactsApi,
        catBreedDao: CatBreedDao
    ) = CatsInteractor(theCatsApi, catFactsApi, catBreedDao)

}