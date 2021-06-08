package com.example.marvelcleanmvvm.framework.data.server

import com.example.marvelcleanmvvm.BuildConfig
import com.example.marvelcleanmvvm.framework.data.server.api.MarvelService
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.security.MessageDigest

object MarvelClient {
    private const val HASH = "hash"
    private const val APIKEY = "apikey"
    private const val TS = "ts"

    private val okHttpClient = OkHttpClient.Builder().apply {
        this.addInterceptor(
            Interceptor { chain ->
                val originalRequest = chain.request()
                val originalHttpUrl = originalRequest.url

                val timeStamp = System.currentTimeMillis()
                val input = "${timeStamp}${BuildConfig.PUBLIC_API_KEY}"
                val hash = MessageDigest.getInstance("MD5")
                    .digest(input.toByteArray()).joinToString("") {
                        "%02x".format(it)
                    }

                val url = originalHttpUrl.newBuilder()
                    .addQueryParameter(TS, "$timeStamp")
                    .addQueryParameter(APIKEY, BuildConfig.PUBLIC_API_KEY)
                    .addQueryParameter(HASH, hash)
                    .build()

                val requestBuilder = originalRequest.newBuilder().url(url)
                val request = requestBuilder.build()
                chain.proceed(request)
            }
        )

        addInterceptor(HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        })
    }

    val service: MarvelService = Retrofit.Builder()
        .baseUrl(BuildConfig.BASE_URL)
        .client(okHttpClient.build())
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .run { create(MarvelService::class.java) }
}