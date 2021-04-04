package at.ac.fhcampuswien.movieapp.ui.detail

import android.app.Application
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import at.ac.fhcampuswien.movieapp.data.Movie
import at.ac.fhcampuswien.movieapp.data.MovieGenerator

@BindingAdapter("android:customImage")
fun setCustomImage(view: ImageView, value: Int?) {
    value?.let {
        view.setImageResource(value)
    }
}

// CUSTOM
// Properly render the list data in your layout.xml file by using BindingAdapters
@BindingAdapter("android:customJulia")
fun setCustomJulia(view: TextView, value: Any?) {
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

// OVERWRITE
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

// OVERWRITE
// Add a setter to the rating attribute, that only sets the rating value if it is between 0 and 5
@BindingAdapter("android:rating")
fun rating(view: RatingBar, value: Float) {
    value?.let {
        if ((value <= 5) && (value >= 0)) {
            view.rating = value
        }
    }
}


class DetailViewModel(
    application: Application,
    selMovie: Movie
) : AndroidViewModel(application) {


    private var _selectedMovie = MutableLiveData<Movie>()
    val selectedMovie: LiveData<Movie>
        get() = _selectedMovie


    private var _floatingActionButtonPressed = MutableLiveData<Boolean>()
    val floatingActionButtonPressed: LiveData<Boolean>
        get() = _floatingActionButtonPressed


    init {
        _selectedMovie.value = selMovie
    }

    fun onClick() {
        _floatingActionButtonPressed.value = true
    }

}
