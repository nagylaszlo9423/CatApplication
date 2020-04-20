package hu.bme.aut.moblab.hw.catapplication.network

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
class NetworkModule {

    @Provides
    @Singleton
    fun provideTheCatApi(): TheCatsApi {
        val retrofit = Retrofit.Builder()
            .baseUrl(NetworkConfig.THE_CATS_API_ENDPOINT)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return retrofit.create(TheCatsApi::class.java)
    }

    @Provides
    @Singleton
    fun provideCatFactApi(): CatFactsApi {
        val retrofit = Retrofit.Builder()
            .baseUrl(NetworkConfig.CAT_FACTS_API_ENDPOINT)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return retrofit.create(CatFactsApi::class.java)
    }
}
