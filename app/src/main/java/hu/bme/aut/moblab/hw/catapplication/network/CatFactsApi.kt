package hu.bme.aut.moblab.hw.catapplication.network

import hu.bme.aut.moblab.hw.catapplication.model.FactResult
import retrofit2.Call
import retrofit2.http.GET

interface CatFactsApi {

    @GET("/facts/random")
    fun getRandomCatFact(): Call<FactResult>

}