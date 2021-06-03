package com.example.usecases

import com.example.repository.MarvelRepository
import com.example.domain.Character

class GetCharacterUseCase(private val marvelRepository: MarvelRepository) {

    suspend fun invoke(id: Int): Character {
        return marvelRepository.getCharacterDetail(id)
    }

}