package at.ac.fhcampuswien.movieapp.ui

import android.widget.RatingBar
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import at.ac.fhcampuswien.movieapp.data.Movie
import at.ac.fhcampuswien.movieapp.data.MovieGenerator

/*
@BindingMethods(
    BindingMethod(
        type = TextView::class,
        attribute = "android:text",
        method = "setText"
    )
)

 */

// Properly render the list data in your layout.xml file by using BindingAdapters
@BindingAdapter("android:text")
fun setText(view: TextView, value: Any?) {
    value?.let {
        when (value) {
            is List<*> -> {
                val separator = ", "
                val newString = value.joinToString(separator)
                view.text = newString
            }
            is String -> view.text = value.toString()
        }
    }
}

// Add a setter to the rating attribute, that only sets the rating value if it is between 0 and 5
@BindingAdapter("android:rating")
fun rating(view: RatingBar, value: Float) {
    value?.let {
        if ((value <= 5) && (value >= 0)) {
            view.rating = value
        }
    }
}


class MovieViewModel : ViewModel() {

    private var _movies = MutableLiveData<List<Movie>>()
    val movies: LiveData<List<Movie>>
        get() = _movies

    private var _selectedMovie = MutableLiveData<Movie>()
    val selectedMovie: LiveData<Movie>
        get() = _selectedMovie

    private var _floatingActionButtonPressed = MutableLiveData<Boolean>()
    val floatingActionButtonPressed: LiveData<Boolean>
        get() = _floatingActionButtonPressed


    init {
        _movies.value = MovieGenerator.getInitMovies

        val movies = MovieGenerator.getInitMovies

        _selectedMovie = MutableLiveData(movies[0])
    }

    fun onClick() {
        _floatingActionButtonPressed.value = true
    }

}
