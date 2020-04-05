package hu.bme.aut.moblab.hw.catapplication.ui.list

import hu.bme.aut.moblab.hw.catapplication.model.CatsListItem

interface CatListScreen {
    fun showCat(cat: CatsListItem?)
    fun showNetworkError(errorMessage: String)
}