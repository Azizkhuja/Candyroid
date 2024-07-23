package com.example.hadith

class HadithRepository(private val apiService: HadithApiService) {
    suspend fun getMultipleRandomHadiths(count: Int): List<HadithResponse> {
        return (1..count).map {
            apiService.getRandomHadith()
        }
    }
}