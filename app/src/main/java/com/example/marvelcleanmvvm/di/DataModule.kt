package com.example.marvelcleanmvvm.di

import com.example.repository.MarvelRepository
import com.example.source.MarvelDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataModule {

    @Provides
    fun provideMarvelRepository(marvelDataSource: MarvelDataSource) =
        MarvelRepository(marvelDataSource)

}