package com.example.kotlin5dz

import com.example.kotlin5dz.databinding.ItemFilmBinding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MovieListAdapter : RecyclerView.Adapter<MovieListAdapter.NewYearViewHolder>() {
    private var newYearItems = listOf<NewYearItem>()

    fun setData(data: List<NewYearItem>) {
        newYearItems = data
        notifyDataSetChanged()
    }

    class NewYearViewHolder(private val binding: ItemFilmBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(newYearItem: NewYearItem) = with(binding) {
            tvNameFilm.text = newYearItem.itemName
            tvFilm.setImageResource(newYearItem.itemImageResId)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewYearViewHolder {
        val binding = ItemFilmBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NewYearViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return newYearItems.size
    }

    override fun onBindViewHolder(holder: NewYearViewHolder, position: Int) {
        holder.bind(newYearItems[position])
    }
}

