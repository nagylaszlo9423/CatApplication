package hu.bme.aut.moblab.hw.catapplication.ui.list

import hu.bme.aut.moblab.hw.catapplication.model.CatBreedListModel

interface CatDetailsScreen {
    fun showCat(cat: CatBreedListModel)
    fun showImage(url: String?)
    fun showRandomFact(fact: String?)
}