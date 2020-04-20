package hu.bme.aut.moblab.hw.catapplication.mock

import hu.bme.aut.moblab.hw.catapplication.db.dao.CatBreedDao
import hu.bme.aut.moblab.hw.catapplication.model.CatBreedModel

object MockCatBreedDao : CatBreedDao {
    override fun getAll(): List<CatBreedModel> {
        return listOf(
            CatBreedModel("id0"),
            CatBreedModel("id1"),
            CatBreedModel("id2")
        )
    }

    override fun insertAll(breeds: List<CatBreedModel>?) {
    }

    override fun deleteAll() {
    }

    override fun findById(id: String): CatBreedModel? {
        return CatBreedModel(id)
    }
}