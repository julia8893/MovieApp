package at.ac.fhcampuswien.movieapp.ui.detail


import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import at.ac.fhcampuswien.movieapp.data.Movie

class DetailViewModelFactory(
    private val application: Application,
    private val selectedMovie: Movie
) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DetailViewModel::class.java)) {
            return DetailViewModel(application, selectedMovie) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}