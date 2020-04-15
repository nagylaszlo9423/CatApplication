package hu.bme.aut.moblab.hw.catapplication.ui.list

import hu.bme.aut.moblab.hw.catapplication.model.CatBreedModel

interface CatListScreen {
    fun showCat(cat: CatBreedModel?)
    fun showNetworkError(errorMessage: String)
}