package com.example.model.dto

class MeaningsDto(
    @field:SerializedName("translation") val translation: TranslationDto?,
    @field:SerializedName("imageUrl") val imageUrl: String?
)