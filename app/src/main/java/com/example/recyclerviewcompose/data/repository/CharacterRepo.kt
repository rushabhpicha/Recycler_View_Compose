package com.example.recyclerviewcompose.data.repository

import android.util.Log
import com.example.recyclerviewcompose.data.api.CharacterApi
import javax.inject.Inject

class CharacterRepo @Inject constructor(
    private val characterApi: CharacterApi
) {
    suspend fun getCharacters(): List<Character> {
        val list: List<Character> = characterApi.getCharacters()

        Log.v("List is", list.toString())

        return characterApi.getCharacters()
    }
}
