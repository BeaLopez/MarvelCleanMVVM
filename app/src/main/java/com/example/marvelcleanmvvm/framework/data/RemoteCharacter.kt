package com.example.marvelcleanmvvm.framework.data

import com.example.domain.Character

data class RemoteCharacter(
    val id: Int,
    val name: String,
    val description: String
)

fun RemoteCharacter.toDomainCharacter() =
    Character(
        id = id,
        name = name,
        description = description
    )
