package com.example.knowow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(1000)
        installSplashScreen()
        setContentView(R.layout.activity_main)
    }

    fun scienceCard(view: View) {

    }
    fun historicalCard(view: View) {}
    fun technologyCard(view: View) {}
    fun natureCard(view: View) {}
    fun sportsCard(view: View) {}
    fun generalCard(view: View) {}
    fun codingCard(view: View) {}
    fun geographyCard(view: View) {}

}