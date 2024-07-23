package com.example.hadith

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

//@Composable
//fun HadithScreen(viewModel: HadithViewModel) {
//    val hadith by viewModel.hadithState.collectAsState()
//    val isLoading by viewModel.isLoading.collectAsState()
//    val error by viewModel.error.collectAsState()
//
//    LaunchedEffect(key1 = Unit) {
//        viewModel.fetchRandomHadith()
//    }
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(16.dp),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        if (isLoading) {
//            CircularProgressIndicator()
//        } else if (error != null) {
//            Text(text = error ?: "Unknown error occurred")
//        } else {
//            hadith?.let { hadithResponse ->
//                Text(text = hadithResponse.hadith, style = MaterialTheme.typography.bodyLarge)
//                Spacer(modifier = Modifier.height(8.dp))
//                Text(text = hadithResponse.narrator, style = MaterialTheme.typography.bodyMedium)
//                Spacer(modifier = Modifier.height(8.dp))
//                Text(text = hadithResponse.reference, style = MaterialTheme.typography.bodySmall)
//            }
//        }
//
//        Spacer(modifier = Modifier.height(16.dp))
//        Button(onClick = { viewModel.fetchRandomHadith() }) {
//            Text("Get New Hadith")
//        }
//    }
//}