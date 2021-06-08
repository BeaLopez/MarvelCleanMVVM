package com.example.usecases

import com.example.repository.MarvelRepository
import com.example.domain.Character

class GetCharacterListUseCase(private val marvelRepository: MarvelRepository) {

    suspend fun invoke(): Result<List<Character>> {
        return marvelRepository.getCharacters()
    }

}