package hu.bme.aut.moblab.hw.catapplication.db

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RoomModule {

    @Provides
    @Singleton
    fun providesCatApplicationDb(context: Context) = Room.databaseBuilder(context, CatApplicationDb::class.java, "cat-database").build()

    @Provides
    @Singleton
    fun providesCatBreedDao(catApplicationDb: CatApplicationDb) = catApplicationDb.catBreedDao()

}