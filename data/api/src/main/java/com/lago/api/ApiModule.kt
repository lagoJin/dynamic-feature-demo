package com.lago.api

import android.content.Context
import com.lago.api.internal.OkHttpInterceptors.createOkHttpInterceptor
import com.lago.api.internal.OkHttpInterceptors.createOkHttpNetworkInterceptor
import dagger.Module
import dagger.Provides
import okhttp3.Cache
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
internal class ApiModule {

    private val API_BASE_URL = ""

    @Provides
    fun provideLagoApiService(
        okHttpClient: OkHttpClient
    ): LagoService {
        return Retrofit.Builder()
            .baseUrl(API_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
            .create(LagoService::class.java)
    }

    @Module
    internal object Providers {
        @Provides
        fun provideOkHttpClient(
            context: Context
        ) : OkHttpClient = OkHttpClient.Builder()
            .cache(Cache(context.cacheDir, 1 * 1024 * 1024)) // 1 MB
            .addInterceptor(createOkHttpInterceptor())
            .addNetworkInterceptor(createOkHttpNetworkInterceptor())
            .addNetworkDebuggingInterceptor()
            .build()
    }

}