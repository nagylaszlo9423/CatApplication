package hu.bme.aut.moblab.hw.catapplication.db

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Singleton

@Module
class RoomModule @Inject constructor(private val application: Application) {
    private val catApplicationDb: CatApplicationDb =
        Room.databaseBuilder(application, CatApplicationDb::class.java, "cat-applocation-db").build()

    @Provides
    @Singleton
    fun providesCatApplicationDb() = catApplicationDb
}