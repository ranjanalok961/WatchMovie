package com.example.watchmovie

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MovieViewModel : ViewModel() {
    private val _movies = MutableStateFlow<List<Movies>>(emptyList())
    val movie: StateFlow<List<Movies>> get() = _movies

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val movies = RetrofitInstance.apiService.getEpisodes()
                Log.d("MovieViewModelData", "Movies fetched: $movies")
                _movies.value = movies
            } catch (e: Exception) {
                Log.e("MovieViewModel", "Error fetching movies", e)
            }
        }
    }
}