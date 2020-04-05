package hu.bme.aut.moblab.hw.catapplication.interactor.cats.event

import hu.bme.aut.moblab.hw.catapplication.model.CatsListItem

data class GetCatsEvent(
    var cats: List<CatsListItem>?,
    var throwable: Throwable?)