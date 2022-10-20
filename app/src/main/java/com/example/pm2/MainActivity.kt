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

        val displayButton1 = findViewById<Button>(R.id.button1)
        val displayButton2 = findViewById<Button>(R.id.button2)
        val displayButton3 = findViewById<Button>(R.id.button3)

        displayButton1.setOnClickListener {
            val displayIntent1 = Intent(this, SearchActivity::class.java)
            startActivity(displayIntent1)
        }
        displayButton2.setOnClickListener {
            val displayIntent2 = Intent(this, MediaActivity::class.java)
            startActivity(displayIntent2)
        }
        displayButton3.setOnClickListener {
            val displayIntent3 = Intent(this, SettingsActivity::class.java)
            startActivity(displayIntent3)


        }

    }
}
