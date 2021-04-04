package at.ac.fhcampuswien.movieapp.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
    val image: Int,
    val title: String,
    val description: String,
    val rating: Float,
    val genres: MutableList<String>?,
    val creators: MutableList<String>,
    val actors: MutableList<String>
): Parcelable