package hu.bme.aut.moblab.hw.catapplication.network

import hu.bme.aut.moblab.hw.catapplication.model.BreedResult
import hu.bme.aut.moblab.hw.catapplication.model.ImageSearchResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface TheCatsApi {

    @GET("/v1/images/search")
    fun findImages(
        @Query("breed_id") breedId: String,
        @Query("limit") limit: Int
    ): Call<List<ImageSearchResult>>

    @GET("/v1/breeds")
    fun getAllCats(): Call<List<BreedResult>>

}