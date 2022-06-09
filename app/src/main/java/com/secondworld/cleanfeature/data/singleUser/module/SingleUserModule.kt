package com.secondworld.cleanfeature.data.singleUser.module

import com.secondworld.cleanfeature.data.singleUser.remote.api.SingleUserApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object SingleUserModule {

    @Provides
    @Singleton
    fun provideSingleUserApi(retrofit: Retrofit) : SingleUserApi =
        retrofit.create(SingleUserApi::class.java)
}