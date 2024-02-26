package com.Portugal1576.data

import com.google.gson.annotations.SerializedName

data class AnimeQuoteCloud(
    val anime: String,
    val character: String,
    val id: Int,
    @SerializedName("quote")
    val quote: String
)