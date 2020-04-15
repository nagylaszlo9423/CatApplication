package hu.bme.aut.moblab.hw.catapplication.ui.list

import hu.bme.aut.moblab.hw.catapplication.model.CatBreedModel

interface CatDetailsScreen {
    fun showCat(cat: CatBreedModel?)
}