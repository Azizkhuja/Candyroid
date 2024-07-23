package com.example.hadith

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class HadithViewModel(private val repository: HadithRepository) : ViewModel() {
    private val _hadithState = MutableStateFlow<HadithResponse?>(null)
    val hadithState: StateFlow<HadithResponse?> = _hadithState

    private val _isLoading = MutableStateFlow(false)
    val isLoading: StateFlow<Boolean> = _isLoading

    private val _error = MutableStateFlow<String?>(null)
    val error: StateFlow<String?> = _error

    fun fetchRandomHadith() {
        viewModelScope.launch {
            _isLoading.value = true
            _error.value = null
            try {
                _hadithState.value = repository.getRandomHadith()
            } catch (e: Exception) {
                _error.value = "Error fetching hadith: ${e.message}"
            } finally {
                _isLoading.value = false
            }
        }
    }
}