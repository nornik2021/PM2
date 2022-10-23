package com.example.pm2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.pm2.MediaActivity
import com.example.pm2.R
import com.example.pm2.SearchActivity
import com.example.pm2.SettingsActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val displayButtonSearch = findViewById<Button>(R.id.buttonSearch)
        val displayButtonMedia = findViewById<Button>(R.id.buttonMedia)
        val displayButtonSettings = findViewById<Button>(R.id.buttonSettings)

        displayButtonSearch.setOnClickListener {
            val displayIntentSearch = Intent(this, SearchActivity::class.java)
            startActivity(displayIntentSearch)
        }
        displayButtonMedia.setOnClickListener {
            val displayIntentMedia = Intent(this, MediaActivity::class.java)
            startActivity(displayIntentMedia)
        }
        displayButtonSettings.setOnClickListener {
            val displayIntentSettings = Intent(this, SettingsActivity::class.java)
            startActivity(displayIntentSettings)


        }

    }
}
