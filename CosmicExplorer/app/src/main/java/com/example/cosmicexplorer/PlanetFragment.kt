package com.example.cosmicexplorer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cosmicexplorer.databinding.FragmentPlanetBinding  // Import your generated View Binding class
import androidx.fragment.app.Fragment

class PlanetFragment : Fragment() {

    private lateinit var binding: FragmentPlanetBinding  // Use the generated binding class

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPlanetBinding.inflate(inflater, container, false)  // Inflate using View Binding
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Set up Planet Fragment content
        binding.planetTextView.text = "Explore the Planets!"

        // You can access other views using binding, e.g., binding.someOtherView
    }
}