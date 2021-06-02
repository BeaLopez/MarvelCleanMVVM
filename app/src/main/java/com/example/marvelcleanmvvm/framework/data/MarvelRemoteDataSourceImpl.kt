package com.example.marvelcleanmvvm.framework.data

import com.example.data.MarvelDataSource
import com.example.domain.Character

class MarvelRemoteDataSourceImpl: MarvelDataSource {

    override fun getCharacters(): List<Character> {
        return listOf(
            RemoteCharacter(1,"Capitana Marvel", "loquesea").toDomainCharacter(),
            RemoteCharacter(2,"Thor", "asdf").toDomainCharacter()
        )
    }

    override fun getCharacterById(id: Int): Character {
        return RemoteCharacter(1,"Capitana Marvel", "loquesea").toDomainCharacter()
    }

}



