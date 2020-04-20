package hu.bme.aut.moblab.hw.catapplication.utils

import okhttp3.Request
import okio.Timeout
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


fun <T> createCall(result: T): Call<T> {
    return object : Call<T> {
        override fun enqueue(callback: Callback<T>) {}

        override fun isExecuted(): Boolean {
            return false
        }

        override fun clone(): Call<T> {
            return this
        }

        override fun isCanceled(): Boolean {
            return false
        }

        override fun cancel() {}

        override fun execute(): Response<T> {
            return Response.success(result)
        }

        override fun request(): Request? {
            return null
        }

        override fun timeout(): Timeout? {
            return null
        }

    }
}
