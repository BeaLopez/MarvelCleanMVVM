package com.example.marvelcleanmvvm.framework.data.server.api

import com.example.marvelcleanmvvm.framework.data.server.response.BaseResponse
import com.example.marvelcleanmvvm.framework.data.server.response.MarvelCharacterResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface MarvelService {
    @GET("/v1/public/characters")
    suspend fun getCharacterList(): Response<BaseResponse<MarvelCharacterResponse>>

    @GET("/v1/public/characters/{id}")
    suspend fun getCharacter(@Path("id") id: Int): Response<BaseResponse<MarvelCharacterResponse>>
}