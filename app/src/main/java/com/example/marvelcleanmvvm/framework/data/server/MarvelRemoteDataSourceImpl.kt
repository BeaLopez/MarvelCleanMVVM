package com.example.marvelcleanmvvm.framework.data.server

import com.example.domain.Character
import com.example.marvelcleanmvvm.framework.data.server.response.toDomainCharacter
import com.example.source.MarvelDataSource

class MarvelRemoteDataSourceImpl : MarvelDataSource {

    override suspend fun getCharacters(): Result<List<Character>> {
        val response = MarvelClient.service.getCharacterList()
        return if (response.isSuccessful) {
            val result = response.body()?.data?.results
            result?.let {
                Result.success(it.map { characterResponse ->
                    characterResponse.toDomainCharacter()
                })
            } ?: Result.failure(Exception("Error"))
        } else {
            Result.failure(Exception(response.message()))
        }
    }

    override suspend fun getCharacterById(id: Int): Result<Character> {
        val response = MarvelClient.service.getCharacter(id)
        return if (response.isSuccessful) {
            val result = response.body()?.data?.results?.firstOrNull()
            result?.let {
                Result.success(it.toDomainCharacter())
            } ?: Result.failure(Exception("Error"))
        } else {
            Result.failure(Exception(response.message()))
        }
    }
}

