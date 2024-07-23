package com.example.hadith

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import com.example.hadith.ui.theme.HadithTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HadithTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    val repository = HadithRepository(RetrofitClient.instance)
//                    val viewModel = HadithViewModel(repository)
//
//                    HadithScreen(viewModel = viewModel)
                    val repository = HadithRepository(RetrofitClient.instance)
                    val viewModel = HadithViewModel(repository)
                    HadithApp(viewModel)
                }
            }
        }
    }
}
