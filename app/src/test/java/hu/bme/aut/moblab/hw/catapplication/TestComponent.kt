package hu.bme.aut.moblab.hw.catapplication

import dagger.Component
import hu.bme.aut.moblab.hw.catapplication.test.CatBreedDetailsTest
import hu.bme.aut.moblab.hw.catapplication.test.CatBreedsTest
import javax.inject.Singleton

@Singleton
@Component(modules = [
    TestModule::class
])
interface TestComponent : CatApplicationComponent {
    fun inject(catBreedsTest: CatBreedsTest)
    fun inject(catBreedDetailsTest: CatBreedDetailsTest)
}