package at.ac.fhcampuswien.movieapp.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import at.ac.fhcampuswien.movieapp.R
import at.ac.fhcampuswien.movieapp.data.Movie
import at.ac.fhcampuswien.movieapp.databinding.FragmentHomeBinding
import androidx.navigation.fragment.findNavController
import at.ac.fhcampuswien.movieapp.ui.MovieAdapter


class HomeFragment : Fragment() {

    private lateinit var viewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_home, container, false)

        val binding: FragmentHomeBinding = DataBindingUtil.inflate<FragmentHomeBinding>(
            // Inflate the layout for this fragment
            inflater, R.layout.fragment_home, container, false
        )
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)

        binding.viewModelXML = viewModel
        binding.lifecycleOwner = this


        /**
         * Adapter
         */

        val adapter = MovieAdapter() { movie: Movie -> onClick(movie) }

        binding.movieList.adapter = adapter

        viewModel.movies.observe(viewLifecycleOwner, Observer {
            it?.let {
                adapter.data = it
            }
        })


        return binding.root
    }

    /**
     * FUNCTIONS
     */

    private fun onClick(movie: Movie) {

        Toast.makeText(
            requireContext(),
            "${movie.title.toString()} selected",
            Toast.LENGTH_LONG
        ).show()

        // Safe Args: Passing whole, selected Movie Object to Detail Fragment
        val action = HomeFragmentDirections.actionHomeFragmentToDetailFragment(movie)
        findNavController().navigate(action)
    }


}