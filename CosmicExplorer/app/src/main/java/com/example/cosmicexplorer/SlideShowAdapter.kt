package com.example.cosmicexplorer

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cosmicexplorer.databinding.SlideShowItemBinding

class SlideShowAdapter(private val imageList: List<Int>) :
    RecyclerView.Adapter<SlideShowAdapter.SlideShowViewHolder>() {

    inner class SlideShowViewHolder(private val binding: SlideShowItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(imageResource: Int) {
            binding.slideImageView.setImageResource(imageResource)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SlideShowViewHolder {
        val binding = SlideShowItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SlideShowViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SlideShowViewHolder, position: Int) {
        val imageResource = imageList[position]
        holder.bind(imageResource)
    }

    override fun getItemCount(): Int {
        return imageList.size
    }
}