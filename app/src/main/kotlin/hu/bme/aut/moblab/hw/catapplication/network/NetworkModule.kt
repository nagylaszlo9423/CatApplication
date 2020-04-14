package hu.bme.aut.moblab.hw.catapplication.network

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.lang.Exception
import javax.inject.Singleton


@Module
class NetworkModule {

    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        return OkHttpClient.Builder().addInterceptor(interceptor).build()
    }

    @Provides
    @Singleton
    fun provideTheCatApi(client: OkHttpClient): TheCatsApi {
        val retrofit = Retrofit.Builder()
            .client(client)
            .baseUrl(NetworkConfig.THE_CATS_API_ENDPOINT)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return retrofit.create(TheCatsApi::class.java)
    }

    @Provides
    @Singleton
    fun provideCatFactApi(client: OkHttpClient): CatFactsApi {
        val retrofit = Retrofit.Builder()
            .client(client)
            .baseUrl(NetworkConfig.CAT_FACTS_API_ENDPOINT)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return retrofit.create(CatFactsApi::class.java)
    }
}
