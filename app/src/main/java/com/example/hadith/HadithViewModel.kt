package com.example.hadith

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class HadithViewModel(private val repository: HadithRepository) : ViewModel() {
    private val _hadithList = MutableStateFlow<List<HadithResponse>>(emptyList())
    val hadithList: StateFlow<List<HadithResponse>> = _hadithList

    private val _isLoading = MutableStateFlow(false)
    val isLoading: StateFlow<Boolean> = _isLoading

    private val _error = MutableStateFlow<String?>(null)
    val error: StateFlow<String?> = _error

    fun fetchRandomHadithList(count: Int = 3) {
        viewModelScope.launch {
            _isLoading.value = true
            _error.value = null
            try {
                _hadithList.value = repository.getMultipleRandomHadiths(count)
            } catch (e: Exception) {
                _error.value = "Error fetching random hadith list: ${e.message}"
            } finally {
                _isLoading.value = false
            }
        }
    }

    private val _randomHadith = MutableStateFlow<HadithResponse?>(null)
    val randomHadith: StateFlow<HadithResponse?> = _randomHadith

    fun fetchSingleRandomHadith() {
        viewModelScope.launch {
            _isLoading.value = true
            _error.value = null
            try {
                _randomHadith.value = repository.getMultipleRandomHadiths(1).firstOrNull()
            } catch (e: Exception) {
                _error.value = "Error fetching random hadith: ${e.message}"
            } finally {
                _isLoading.value = false
            }
        }
    }
}