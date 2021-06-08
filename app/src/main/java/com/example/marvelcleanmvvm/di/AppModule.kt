package com.example.marvelcleanmvvm.di

import com.example.marvelcleanmvvm.framework.data.server.MarvelRemoteDataSourceImpl
import com.example.source.MarvelDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    fun provideMarvelRemoteDataSource(): MarvelDataSource = MarvelRemoteDataSourceImpl()

}