package com.example.cosmicexplorer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.cosmicexplorer.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding  // Use the generated binding class

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)  // Inflate using View Binding
        setContentView(binding.root)

        // Set up TabLayout and ViewPager
        val viewPager = binding.viewPager
        val tabLayout = binding.tabLayout

        viewPager.adapter = ViewPagerAdapter(this)

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            // Customize tab names here
            tab.text = when (position) {
                0 -> "Planet"
                1 -> "Slide Show"
                else -> "Tab ${position + 1}"
            }
        }.attach()

        // Set up Bottom Sheet Button click listener
        binding.showBottomSheetButton.setOnClickListener {
            val bottomSheetFragment = BottomSheetFragment()
            bottomSheetFragment.show(supportFragmentManager, bottomSheetFragment.tag)
        }

        // Set up Snackbar Button click listener
        binding.showSnackbarButton.setOnClickListener {
            Snackbar.make(binding.root, "This is a Snackbar!", Snackbar.LENGTH_SHORT).show()
        }
    }
}