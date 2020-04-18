package hu.bme.aut.moblab.hw.catapplication.network

import hu.bme.aut.moblab.hw.catapplication.model.BreedResult
import retrofit2.Call
import retrofit2.http.GET

interface TheCatsApi {

    @GET("/breeds")
    fun getAllCats(): Call<List<BreedResult>>

}