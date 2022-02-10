package com.example.model.dto

class SearchResultDto(
    @field:SerializedName("text") val text: String?,
    @field:SerializedName("meanings") val meanings: List<MeaningsDto?>?
)