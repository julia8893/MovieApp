package at.ac.fhcampuswien.movieapp.data

data class Movie(val title: String, val description: String, val rating: Float,
                 val genres: String?, val creators: String, val actors: String) {
}