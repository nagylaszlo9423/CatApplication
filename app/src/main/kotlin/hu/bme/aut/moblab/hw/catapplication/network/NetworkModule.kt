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
        throw Exception("Not implemented")
    }

    @Provides
    @Singleton
    fun provideArtistsApi(client: OkHttpClient): TheCatsApi {
        throw Exception("Not implemented")
    }
}
