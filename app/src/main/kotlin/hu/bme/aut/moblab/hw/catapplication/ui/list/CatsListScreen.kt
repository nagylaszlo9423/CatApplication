package hu.bme.aut.moblab.hw.catapplication.ui.list

import hu.bme.aut.moblab.hw.catapplication.model.CatBreedModel

interface CatsListScreen {
    fun showCats(cats: List<CatBreedModel>?)
}