package com.example.marvelcleanmvvm.ui.detail.di

import com.example.repository.MarvelRepository
import com.example.usecases.GetCharacterUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
class DetailFragmentModule {

    @Provides
    @ViewModelScoped
    fun provideGetCharacterUseCase(marvelRepository: MarvelRepository) =
        GetCharacterUseCase(marvelRepository)

}