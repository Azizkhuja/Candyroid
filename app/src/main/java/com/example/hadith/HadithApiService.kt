package com.example.hadith

import retrofit2.http.GET
import retrofit2.http.Headers

interface HadithApiService {
    @Headers(
        "X-RapidAPI-Key: 5275a8e1dcmshe6cde61534690eap13333ejsncffe8ac2d285",
        "X-RapidAPI-Host: hadith2.p.rapidapi.com"
    )
    @GET("random")
    suspend fun getRandomHadith(): HadithResponse
}