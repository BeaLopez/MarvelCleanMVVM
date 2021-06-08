package com.example.repository

import com.example.domain.Character
import com.example.source.MarvelDataSource

class MarvelRepository(private val marvelDataSource: MarvelDataSource) {

    suspend fun getCharacters(): Result<List<Character>> {
        return marvelDataSource.getCharacters()
    }

    suspend fun getCharacterDetail(id: Int): Result<Character> {
        return marvelDataSource.getCharacterById(id)
    }
}