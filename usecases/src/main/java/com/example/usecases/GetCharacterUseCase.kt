package com.example.usecases

import com.example.data.MarvelRepository
import com.example.domain.Character

class GetCharacterUseCase(private val marvelRepository: MarvelRepository) {

    fun invoke(id: Int): Character {
        return marvelRepository.getCharacterDetail(id)
    }

}