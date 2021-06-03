package com.example.marvelcleanmvvm.framework.data

import com.example.domain.Character
import com.example.source.MarvelDataSource

class MarvelRemoteDataSourceImpl : MarvelDataSource {

    override suspend fun getCharacters(): List<Character> {
        return listOf(
            RemoteCharacter(1, "Capitana Marvel", "loquesea").toDomainCharacter(),
            RemoteCharacter(2, "Thor", "asdf").toDomainCharacter()
        )
    }

    override suspend fun getCharacterById(id: Int): Character {
        return RemoteCharacter(1, "Capitana Marvel", "loquesea").toDomainCharacter()
    }

}



