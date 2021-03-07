package at.ac.fhcampuswien.movieapp.data

data class Movie(
    val title: String,
    val description: String,
    val rating: Float,
    val genres: MutableList<String>?,
    val creators: MutableList<String>,
    val actors: MutableList<String>
) {
}