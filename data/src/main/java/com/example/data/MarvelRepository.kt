package com.example.data
import com.example.domain.Character

class MarvelRepository(private val marvelDataSource: MarvelDataSource) {

    fun getCharacters(): List<Character> {
        return marvelDataSource.getCharacters()
    }

    fun getCharacterDetail(id: Int): Character {
        return marvelDataSource.getCharacterById(id)
    }
}

interface MarvelDataSource {
    fun getCharacters(): List<Character>
    fun getCharacterById(id: Int): Character
}