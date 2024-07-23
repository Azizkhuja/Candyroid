package com.example.hadith

sealed class Screen(val route: String) {
    object RandomHadith : Screen("Single Hadith")
    object HadithList : Screen("List of hadith")
}