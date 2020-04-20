package hu.bme.aut.moblab.hw.catapplication.mock

import hu.bme.aut.moblab.hw.catapplication.model.FactResult
import hu.bme.aut.moblab.hw.catapplication.network.CatFactsApi
import hu.bme.aut.moblab.hw.catapplication.utils.createCall
import retrofit2.Call

object MockCatFactsApi : CatFactsApi {
    override fun getRandomCatFact(): Call<FactResult> {
        return createCall(
            FactResult(
            id = "id0",
            text = "text0"
        ))
    }
}