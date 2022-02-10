package com.example.repository.api

import androidx.room.Query

interface ApiService {

    @GET("words/search")
    fun searchAsync(@Query("search") wordToSearch: String): Deferred<List<SearchResultDto>>
}