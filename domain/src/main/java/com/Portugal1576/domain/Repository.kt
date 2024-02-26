package com.Portugal1576.domain

interface Repository {
    suspend fun loadQuote(): Pair<Boolean, String>
}