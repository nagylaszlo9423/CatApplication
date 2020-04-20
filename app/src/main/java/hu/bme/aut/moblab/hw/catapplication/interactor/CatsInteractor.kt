package hu.bme.aut.moblab.hw.catapplication.interactor

import hu.bme.aut.moblab.hw.catapplication.db.dao.CatBreedDao
import hu.bme.aut.moblab.hw.catapplication.model.*
import hu.bme.aut.moblab.hw.catapplication.network.CatFactsApi
import hu.bme.aut.moblab.hw.catapplication.network.TheCatsApi
import hu.bme.aut.moblab.hw.catapplication.util.Contexts
import kotlinx.coroutines.withContext
import javax.inject.Inject

class CatsInteractor @Inject constructor (
    private val theCatsApi: TheCatsApi,
    private val catFactsApi: CatFactsApi,
    private val catBreedDao: CatBreedDao
) {

    suspend fun getAllCats(): List<CatBreedModel> = withContext(Contexts.NETWORK){
        val allCatsCall = theCatsApi.getAllCats()
        val allCatsResponse = allCatsCall.execute()

        if (allCatsResponse.isSuccessful) {
            catBreedDao.deleteAll()
            catBreedDao.insertAll(allCatsResponse.body()?.map(BreedResult::toModel))
        }

        return@withContext catBreedDao.getAll()
    }

    suspend fun getCatById(id: String): CatBreedListModel = withContext(Contexts.NETWORK) {
        return@withContext CatBreedListModel(catBreedDao.findById(id))
    }

    suspend fun getImageUrlForCatById(id: String): String? = withContext(Contexts.NETWORK) {
        val call = theCatsApi.findImages(id, 1)
        val response = call.execute()

        if (response.body()!!.isNotEmpty()) {
            return@withContext response.body()!![0].url
        }

        return@withContext null
    }

    suspend fun getRandomCatFact(): String? = withContext(Contexts.NETWORK) {
        val catFactCall = catFactsApi.getRandomCatFact()
        val catFactResponse = catFactCall.execute()

        if (catFactResponse.isSuccessful) {
            return@withContext catFactResponse.body()?.text
        }

        return@withContext null
    }

}