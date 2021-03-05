package at.ac.fhcampuswien.movieapp.ui

import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import at.ac.fhcampuswien.movieapp.data.Movie
import at.ac.fhcampuswien.movieapp.data.MovieGenerator

class MovieViewModel : ViewModel() {

    private var _movies = MutableLiveData<List<Movie>>()
    val movies: LiveData<List<Movie>>
        get() = _movies

    private var _floatingActionButtonPressed = MutableLiveData<Boolean>()
    val floatingActionButtonPressed: LiveData<Boolean>
        get() = _floatingActionButtonPressed

    init {
        _movies.value = MovieGenerator.getInitMovies
    }

    fun printMessage(){
        _floatingActionButtonPressed.value = true
    }

}