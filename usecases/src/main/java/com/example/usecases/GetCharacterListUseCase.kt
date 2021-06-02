package com.example.usecases

import com.example.data.MarvelRepository
import com.example.domain.Character

class GetCharacterListUseCase(private val marvelRepository: MarvelRepository) {

    fun invoke(): List<Character> {
        return marvelRepository.getCharacters()
    }

}