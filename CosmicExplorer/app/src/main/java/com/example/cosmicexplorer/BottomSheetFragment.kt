package com.example.cosmicexplorer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cosmicexplorer.databinding.FragmentBottomSheetBinding  // Import your generated View Binding class
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BottomSheetFragment : BottomSheetDialogFragment() {

    private lateinit var binding: FragmentBottomSheetBinding  // Use the generated binding class

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBottomSheetBinding.inflate(inflater, container, false)  // Inflate using View Binding
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Set up Bottom Sheet content
        binding.bottomSheetTextView.text = "Welcome to Cosmic Explorer!"

        // You can access other views using binding, e.g., binding.someOtherView
    }
}