package com.example.playlistmaker

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // onClick searchButton
        val searchButton = findViewById<Button>(R.id.searchButton)
        searchButton.setOnClickListener {
            val searchIntent = Intent(this, SearchActivity::class.java)
            startActivity(searchIntent)
        }

        //onClick multimediaButton
        val multimediaButton = findViewById<Button>(R.id.multimediaButton)

        multimediaButton.setOnClickListener {
            val multimediaIntent = Intent(this, MultimediaActivity::class.java)
            startActivity(multimediaIntent)
        }

        //onClick multimediaButton
        val settingsButton = findViewById<Button>(R.id.settingsButton)

        settingsButton.setOnClickListener {
            val settingsIntent = Intent(this, SettingsActivity::class.java)
            startActivity(settingsIntent)
        }
    }
}