package com.example.knowow

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var randomCategory: TextView
    private lateinit var randomFact: TextView
    private lateinit var randomImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(1000)
        installSplashScreen()
        setContentView(R.layout.activity_main)
        randomCategory = findViewById(R.id.category)
        randomFact = findViewById(R.id.randomFact)
        randomImage = findViewById(R.id.randomFactImage)

        displayRandomFact()
        // Change the action bar color
        supportActionBar?.setBackgroundDrawable(ColorDrawable(ContextCompat.getColor(this, R.color.actColor)))

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_item, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.refresh -> {
                displayRandomFact()
                true
            }

            else -> false
        }
    }



    private fun displayRandomFact() {
        val facts = arrayOf(R.array.science_facts_array, R.array.historical_facts_array, R.array.technology_facts_array, R.array.sports_facts_array, R.array.general_facts_array, R.array.coding_facts_array, R.array.geography_facts_array, R.array.nature_facts_array)
        val factsCategory = arrayOf("Science", "History", "Technology", "Sports", "General", "Coding", "Geography", "Nature")
        val random = Random.Default
        val ranArrInd = random.nextInt(facts.size)
        val factArray = resources.getStringArray(facts[ranArrInd])
        val ranFactInd = random.nextInt(factArray.size)
        randomCategory.text = factsCategory[ranArrInd]
        randomFact.text = factArray[ranFactInd]
        when(ranArrInd) {
            0 -> randomImage.setImageResource(R.drawable.science)
            1 -> randomImage.setImageResource(R.drawable.history)
            2 -> randomImage.setImageResource(R.drawable.technology)
            3 -> randomImage.setImageResource(R.drawable.sports)
            4 -> randomImage.setImageResource(R.drawable.general)
            5 -> randomImage.setImageResource(R.drawable.coding)
            6 -> randomImage.setImageResource(R.drawable.geography)
            7 -> randomImage.setImageResource(R.drawable.nature)
        }
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
        val scienceFactsArray = resources.getStringArray(R.array.historical_facts_array)
        val intent = Intent(this, FactsSection::class.java).apply{
            putExtra("factsArray", scienceFactsArray)
            putExtra("category", "History")
            putExtra("image", R.drawable.history)
        }
        startActivity(intent)
    }
    fun technologyCard(view: View) {
        val scienceFactsArray = resources.getStringArray(R.array.technology_facts_array)
        val intent = Intent(this, FactsSection::class.java).apply{
            putExtra("factsArray", scienceFactsArray)
            putExtra("category", "Technology")
            putExtra("image", R.drawable.technology)
        }
        startActivity(intent)
    }
    fun natureCard(view: View) {
        val scienceFactsArray = resources.getStringArray(R.array.nature_facts_array)
        val intent = Intent(this, FactsSection::class.java).apply{
            putExtra("factsArray", scienceFactsArray)
            putExtra("category", "Nature")
            putExtra("image", R.drawable.nature)
        }
        startActivity(intent)
    }
    fun sportsCard(view: View) {
        val scienceFactsArray = resources.getStringArray(R.array.sports_facts_array)
        val intent = Intent(this, FactsSection::class.java).apply{
            putExtra("factsArray", scienceFactsArray)
            putExtra("category", "Sports")
            putExtra("image", R.drawable.sports)
        }
        startActivity(intent)
    }
    fun generalCard(view: View) {
        val scienceFactsArray = resources.getStringArray(R.array.general_facts_array)
        val intent = Intent(this, FactsSection::class.java).apply{
            putExtra("factsArray", scienceFactsArray)
            putExtra("category", "General")
            putExtra("image", R.drawable.general)
        }
        startActivity(intent)
    }
    fun codingCard(view: View) {
        val scienceFactsArray = resources.getStringArray(R.array.coding_facts_array)
        val intent = Intent(this, FactsSection::class.java).apply{
            putExtra("factsArray", scienceFactsArray)
            putExtra("category", "Coding")
            putExtra("image", R.drawable.coding)
        }
        startActivity(intent)
    }
    fun geographyCard(view: View) {
        val scienceFactsArray = resources.getStringArray(R.array.geography_facts_array)
        val intent = Intent(this, FactsSection::class.java).apply{
            putExtra("factsArray", scienceFactsArray)
            putExtra("category", "Geography")
            putExtra("image", R.drawable.geography)
        }
        startActivity(intent)
    }

}