package com.betulantep.bookstoreapp.data.di

import com.betulantep.bookstoreapp.data.retrofit.AppRemoteDao
import com.betulantep.bookstoreapp.utils.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {
    @Provides
    @Singleton
    fun provideRetrofitClient(): Retrofit{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun provideAppRemoteDao(retrofit: Retrofit):AppRemoteDao{
        return retrofit.create(AppRemoteDao::class.java)
    }
}