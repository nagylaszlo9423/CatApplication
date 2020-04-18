package hu.bme.aut.moblab.hw.catapplication.interactor

import android.content.Context
import dagger.Module
import dagger.Provides
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
        context: Context
    ) = CatsInteractor(theCatsApi, catFactsApi, context)

}