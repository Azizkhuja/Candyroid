package com.example.hadith

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun HadithApp(viewModel: HadithViewModel) {
    val navController = rememberNavController()
    val items = listOf(Screen.HadithList, Screen.RandomHadith)

    Scaffold(
        bottomBar = { BottomNavigationBar(navController, items) }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.HadithList.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(Screen.HadithList.route) {
                HadithListScreen(viewModel)
            }
            composable(Screen.RandomHadith.route) {
                RandomHadithScreen(viewModel)
            }
        }
    }
}