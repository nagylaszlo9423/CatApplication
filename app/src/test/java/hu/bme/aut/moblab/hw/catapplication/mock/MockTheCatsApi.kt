package hu.bme.aut.moblab.hw.catapplication.mock

import hu.bme.aut.moblab.hw.catapplication.model.BreedResult
import hu.bme.aut.moblab.hw.catapplication.model.ImageSearchResult
import hu.bme.aut.moblab.hw.catapplication.network.TheCatsApi
import hu.bme.aut.moblab.hw.catapplication.utils.createCall
import retrofit2.Call

object MockTheCatsApi : TheCatsApi {
    override fun findImages(breedId: String, limit: Int): Call<List<ImageSearchResult>> {
        return createCall(
            listOf(
                ImageSearchResult("id0", "url0"),
                ImageSearchResult("id1", "url1"),
                ImageSearchResult("id2", "url2")
            )
        )
    }

    override fun getAllCats(): Call<List<BreedResult>> {
        return createCall(
            listOf(
                BreedResult("id0"),
                BreedResult("id1"),
                BreedResult("id2")
            )
        )
    }
}