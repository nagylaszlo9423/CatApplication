package hu.bme.aut.moblab.hw.catapplication.interactor.cats.event

import hu.bme.aut.moblab.hw.catapplication.model.FactResult

data class GetRandomCatFactEvent(
    var catFact: FactResult? = null,
    var throwable: Throwable? = null
)