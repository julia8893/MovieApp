package at.ac.fhcampuswien.movieapp.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import at.ac.fhcampuswien.movieapp.R
import at.ac.fhcampuswien.movieapp.data.Movie


class MovieAdapter : RecyclerView.Adapter<MovieAdapter.ViewHolder>() {

    var data = listOf<Movie>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }


    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    class ViewHolder private constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewTitle: TextView = itemView.findViewById(R.id.textView_card_title)
        val textViewCreators: TextView = itemView.findViewById(R.id.textView_card_creators)
        val textViewActors: TextView = itemView.findViewById(R.id.textView_card_actors)

        fun bind(item: Movie) {
            val res = itemView.context.resources
            textViewTitle.text = item.title
            textViewCreators.text = item.creators.toString()
            textViewActors.text = item.actors.toString()
        }


        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val view = layoutInflater.inflate(R.layout.card_item, parent, false)

                return ViewHolder(view)
            }
        }
    }
}