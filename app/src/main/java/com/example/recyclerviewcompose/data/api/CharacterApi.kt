package com.example.recyclerviewcompose.data.api

import retrofit2.http.GET

interface CharacterApi {
    @GET(ApiConstants.END_POINT)
    suspend fun getCharacters(): List<Character>
}