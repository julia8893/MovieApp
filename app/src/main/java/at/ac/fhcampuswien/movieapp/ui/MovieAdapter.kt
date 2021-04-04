package at.ac.fhcampuswien.movieapp.ui

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import at.ac.fhcampuswien.movieapp.R
import at.ac.fhcampuswien.movieapp.data.Movie


class MovieAdapter(
    val buttonAdapterOnClick: (Movie) -> Unit
) : RecyclerView.Adapter<MovieAdapter.ViewHolder>() {

    var data = listOf<Movie>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)

        holder.btnSeeDetail.setOnClickListener() {
            buttonAdapterOnClick(item)
            Log.i("MovieAdapter", "Button funktioniert! ${item.title}")
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder.from(parent)

        //val layoutInflater = LayoutInflater.from(parent.context)
        //val view = layoutInflater.inflate(R.layout.card_item, parent, false)
        //return ViewHolder(view)
    }

    class ViewHolder private constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {

        // get references to the views
        private val textViewTitle: TextView = itemView.findViewById(R.id.textView_card_title)
        private val textViewCreators: TextView = itemView.findViewById(R.id.textView_card_creators)
        private val textViewActors: TextView = itemView.findViewById(R.id.textView_card_actors)
        val btnSeeDetail: Button = itemView.findViewById(R.id.button_card_see_detail)

        fun bind(item: Movie) {
            val res = itemView.context.resources
            textViewTitle.text = item.title
            //textViewCreators.text = item.creators.toString()
            //textViewActors.text = item.actors.toString()

            val creatorsWithoutBrackets = item.creators.toString().replace("[", "").replace("]", "")
            textViewCreators.text = creatorsWithoutBrackets

            val actorsWithoutBrackets = item.actors.toString().replace("[", "").replace("]", "")
            textViewActors.text = actorsWithoutBrackets
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