package hu.bme.aut.moblab.hw.catapplication.ui.list

import hu.bme.aut.moblab.hw.catapplication.model.CatsListItem

interface CatsListScreen {
    fun showCats(cats: List<CatsListItem>?)
    fun showNetworkError(errorMessage: String)
}