package com.example.cosmicexplorer

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int {
        return 2 // Set the number of tabs here (PlanetFragment and SlideShowFragment)
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> PlanetFragment()
            1 -> SlideShowFragment()
            else -> Fragment()
        }
    }
}