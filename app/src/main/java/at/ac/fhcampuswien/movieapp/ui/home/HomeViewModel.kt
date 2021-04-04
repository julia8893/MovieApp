package at.ac.fhcampuswien.movieapp.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import at.ac.fhcampuswien.movieapp.data.Movie
import at.ac.fhcampuswien.movieapp.data.MovieGenerator


class HomeViewModel : ViewModel() {

    private var _movies = MutableLiveData<List<Movie>>()
    val movies: LiveData<List<Movie>>
        get() = _movies

    init {

        // get all movies in MovieGenerator class
        _movies.value = MovieGenerator.getInitMovies

        /*
        val movies = MovieGenerator.getInitMovies
        _selectedMovie = MutableLiveData(movies[0])
         */

    }

}
