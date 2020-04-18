package hu.bme.aut.moblab.hw.catapplication.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import hu.bme.aut.moblab.hw.catapplication.model.CatBreedModel

@Dao
interface CatBreedDao {

    @Query("SELECT * FROM ${CatBreedModel.TABLE_NAME}")
    fun getAll(): List<CatBreedModel>

    @Insert
    fun insertAll(breeds: List<CatBreedModel>?)

    @Query("DELETE FROM ${CatBreedModel.TABLE_NAME}")
    fun deleteAll()

    @Query("SELECT * FROM ${CatBreedModel.TABLE_NAME} WHERE id = :id")
    fun findById(id: String): CatBreedModel?

}