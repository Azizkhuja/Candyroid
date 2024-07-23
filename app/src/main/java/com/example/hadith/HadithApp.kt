package com.example.hadith

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun HadithApp(viewModel: HadithViewModel) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "hadithList") {
        composable("hadithList") {
            HadithListScreen(
                viewModel = viewModel,
                onNavigateToRandomHadith = { navController.navigate("randomHadith") }
            )
        }
        composable("randomHadith") {
            RandomHadithScreen(
                viewModel = viewModel,
                onNavigateBack = { navController.popBackStack() }
            )
        }
    }
}