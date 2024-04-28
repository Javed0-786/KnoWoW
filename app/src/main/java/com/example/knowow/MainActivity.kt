package com.example.knowow

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(1000)
        installSplashScreen()
        setContentView(R.layout.activity_main)

        // Change the action bar color
        supportActionBar?.setBackgroundDrawable(ColorDrawable(ContextCompat.getColor(this, R.color.actColor)))
    }

    fun scienceCard(view: View) {
        val scienceFactsArray = resources.getStringArray(R.array.science_facts_array)
        val intent = Intent(this, FactsSection::class.java).apply{
            putExtra("factsArray", scienceFactsArray)
            putExtra("category", "Science")
            putExtra("image", R.drawable.science)
        }
        startActivity(intent)
    }
    fun historicalCard(view: View) {
        val scienceFactsArray = resources.getStringArray(R.array.science_facts_array)
        val intent = Intent(this, FactsSection::class.java).apply{
            putExtra("factsArray", scienceFactsArray)
            putExtra("category", "Science")
            putExtra("image", R.drawable.science)
        }
        startActivity(intent)
    }
    fun technologyCard(view: View) {}
    fun natureCard(view: View) {}
    fun sportsCard(view: View) {}
    fun generalCard(view: View) {}
    fun codingCard(view: View) {}
    fun geographyCard(view: View) {}

}