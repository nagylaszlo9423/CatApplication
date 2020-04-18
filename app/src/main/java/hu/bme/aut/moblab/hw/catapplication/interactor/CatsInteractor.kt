package hu.bme.aut.moblab.hw.catapplication.interactor

import android.content.Context
import androidx.room.Room
import hu.bme.aut.moblab.hw.catapplication.db.CatApplicationDb
import hu.bme.aut.moblab.hw.catapplication.model.*
import hu.bme.aut.moblab.hw.catapplication.network.CatFactsApi
import hu.bme.aut.moblab.hw.catapplication.network.TheCatsApi
import hu.bme.aut.moblab.hw.catapplication.util.Contexts
import kotlinx.coroutines.withContext
import javax.inject.Inject

class CatsInteractor @Inject constructor (
    private val theCatsApi: TheCatsApi,
    private val catFactsApi: CatFactsApi,
    applicationContext: Context
) {

    private val db = Room.databaseBuilder(
        applicationContext,
        CatApplicationDb::class.java, "cat-database"
    ).build()

    suspend fun getAllCats(): List<CatBreedModel> = withContext(Contexts.NETWORK){
        val allCatsCall = theCatsApi.getAllCats()
        val allCatsResponse = allCatsCall.execute()

        if (allCatsResponse.isSuccessful) {
            db.catBreedDao().deleteAll()
            db.catBreedDao().insertAll(allCatsResponse.body()?.map(BreedResult::toModel))
        }

        return@withContext db.catBreedDao().getAll()
    }

    suspend fun getCatById(id: String): CatBreedListModel = withContext(Contexts.NETWORK) {
        return@withContext CatBreedListModel(db.catBreedDao().findById(id))
    }

    suspend fun getImageUrlForCatById(id: String): String? = withContext(Contexts.NETWORK) {
        val call = theCatsApi.findImages(id, 1)
        val response = call.execute()

        if (response.body()!!.isNotEmpty()) {
            return@withContext response.body()!![0].url
        }

        return@withContext null
    }

    suspend fun getRandomCatFact(): FactResult? = withContext(Contexts.NETWORK) {
        val catFactCall = catFactsApi.getRandomCatFact()
        val catFactResponse = catFactCall.execute()

        if (catFactResponse.isSuccessful) {
            return@withContext catFactResponse.body()
        }

        return@withContext null
    }

}