package hu.bme.aut.moblab.hw.catapplication.db

import androidx.room.Database
import androidx.room.RoomDatabase
import hu.bme.aut.moblab.hw.catapplication.db.dao.CatBreedDao
import hu.bme.aut.moblab.hw.catapplication.model.CatBreedModel

@Database(entities = [CatBreedModel::class], version = 1)
abstract class CatApplicationDb : RoomDatabase() {
    abstract fun catBreedDao(): CatBreedDao
}