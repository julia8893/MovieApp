package at.ac.fhcampuswien.movieapp.ui

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
import at.ac.fhcampuswien.movieapp.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {

    private lateinit var viewModel: MovieViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentDetailBinding = DataBindingUtil.inflate<FragmentDetailBinding>(
            // Inflate the layout for this fragment
            inflater, R.layout.fragment_detail, container, false
        )
        viewModel = ViewModelProvider(this).get(MovieViewModel::class.java)
        binding.viewModelXML = viewModel
        binding.lifecycleOwner = this

        /**
         * Observer
         */
        viewModel.floatingActionButtonPressed.observe(viewLifecycleOwner, Observer {
            val message = "Servus de Madln!"
            Toast.makeText(requireContext(), message, Toast.LENGTH_LONG).show()
        })

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /*
        view.findViewById<Button>(R.id.button_first).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }*/
    }
}