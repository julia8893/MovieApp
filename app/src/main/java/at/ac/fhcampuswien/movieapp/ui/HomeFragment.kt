package at.ac.fhcampuswien.movieapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import at.ac.fhcampuswien.movieapp.R
import at.ac.fhcampuswien.movieapp.databinding.FragmentDetailBinding
import at.ac.fhcampuswien.movieapp.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var viewModel: MovieViewModel

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
        viewModel = ViewModelProvider(this).get(MovieViewModel::class.java)
        binding.viewModelXML = viewModel
        binding.lifecycleOwner = this


        // Adapter
        val adapter = MovieAdapter()

        binding.movieList.adapter = adapter

        viewModel.movies.observe(viewLifecycleOwner, Observer {
                it?.let {
                    adapter.data = it
                }
            })

        return binding.root

    }
}