package com.example.hadith

class HadithRepository(private val apiService: HadithApiService) {
    suspend fun getRandomHadith(): HadithResponse {
        return apiService.getRandomHadith()
    }
}