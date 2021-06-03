package com.example.marvelcleanmvvm.ui.main.di

import com.example.repository.MarvelRepository
import com.example.usecases.GetCharacterListUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
class MainFragmentModule {

    @Provides
    @ViewModelScoped
    fun provideGetCharacterListUseCase(marvelRepository: MarvelRepository) =
        GetCharacterListUseCase(marvelRepository)

}