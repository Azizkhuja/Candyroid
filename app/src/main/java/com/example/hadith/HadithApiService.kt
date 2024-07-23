package com.example.hadith

import retrofit2.http.GET
import retrofit2.http.Headers

interface HadithApiService {
    companion object {
        const val X_RAPID_API_KEY = BuildConfig.X_RAPID_API_KEY
    }
    @Headers(
        "X-RapidAPI-Key: $X_RAPID_API_KEY",
        "X-RapidAPI-Host: hadith2.p.rapidapi.com"
    )
    @GET("random")
    suspend fun getRandomHadith(): HadithResponse
}