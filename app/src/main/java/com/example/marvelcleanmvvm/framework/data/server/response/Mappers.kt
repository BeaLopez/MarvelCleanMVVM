package com.example.marvelcleanmvvm.framework.data.server.response

import com.example.domain.Character

fun CharacterResponse.toDomainCharacter() = Character(
    id = id ?: 0,
    name = name.orEmpty(),
    description = description.orEmpty()
)