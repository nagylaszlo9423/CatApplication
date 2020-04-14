package hu.bme.aut.moblab.hw.catapplication.interactor.cats.event

import hu.bme.aut.moblab.hw.catapplication.model.BreedResult

data class GetCatsEvent(
    var cats: List<BreedResult>? = null,
    var throwable: Throwable? = null
)