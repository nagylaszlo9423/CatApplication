package hu.bme.aut.moblab.hw.catapplication

import android.content.Context
import dagger.Module
import dagger.Provides
import hu.bme.aut.moblab.hw.catapplication.interactor.CatsInteractor
import hu.bme.aut.moblab.hw.catapplication.mock.MockCatBreedDao
import hu.bme.aut.moblab.hw.catapplication.mock.MockCatFactsApi
import hu.bme.aut.moblab.hw.catapplication.mock.MockTheCatsApi
import hu.bme.aut.moblab.hw.catapplication.ui.details.CatPresenter
import hu.bme.aut.moblab.hw.catapplication.ui.list.CatsPresenter
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.TestCoroutineScope
import javax.inject.Singleton

@Module
class TestModule(context: Context) : ApplicationModule(context) {

    @Provides
    @Singleton
    fun provideCatsInteractor() = CatsInteractor(MockTheCatsApi, MockCatFactsApi, MockCatBreedDao)

    @Provides
    @Singleton
    fun provideCatsPresenter(catsInteractor: CatsInteractor) = CatsPresenter(catsInteractor)

    @Provides
    @Singleton
    fun provideCatPresenter(catsInteractor: CatsInteractor) = CatPresenter(catsInteractor)

}