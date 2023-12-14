package com.example.kotlin5dz

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin5dz.databinding.ActivityMovieListBinding

class MovieListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMovieListBinding
    private val movieListAdapter = MovieListAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovieListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fillMoviesList()
        setupRecyclerView()
    }

    private fun fillMoviesList() {
            val newYearItems = listOf(
                NewYearItem("Party Hat", R.drawable.claus, "Festive accessory"),
                NewYearItem("Confetti Poppers", R.drawable.could_heart, "Celebration essentials"),
                NewYearItem("Champagne Glasses", R.drawable.grinch, "Toasting to the New Year"),
                NewYearItem("Fireworks", R.drawable.hranitel, "Spectacular light show"),
                NewYearItem("Countdown Clock", R.drawable.iv_one_home, "Marking the seconds"),
                NewYearItem("Sparklers", R.drawable.madakaskar, "Magical lights for celebration"),
                NewYearItem("New Year Decorations", R.drawable.mikki, "Adornments for the party"),
                NewYearItem("Resolution List", R.drawable.prostokvashino, "Setting goals for the year"),
                NewYearItem("Midnight Kiss", R.drawable.shrek, "Tradition for good luck"),
                NewYearItem("New Year's Eve Ball", R.drawable.mikki, "Iconic symbol of the countdown")
            )
        movieListAdapter.setData(newYearItems)
        }


    private fun setupRecyclerView() {
        binding.rvFilm.adapter = movieListAdapter
    }
}

