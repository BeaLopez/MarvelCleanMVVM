package com.example.source
import com.example.domain.Character

interface MarvelDataSource {
    suspend fun getCharacters(): Result<List<Character>>
    suspend fun getCharacterById(id: Int): Result<Character>
}