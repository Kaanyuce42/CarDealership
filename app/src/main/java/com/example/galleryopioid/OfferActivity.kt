package com.example.galleryopioid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class OfferActivity : AppCompatActivity() {
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_offer)

        button = findViewById(R.id.button3)

        button.setOnClickListener{ view ->
            onSeriesButtonClick(view)
        }
    }
    private fun onSeriesButtonClick(view: View) {
        val wait = 1000L
        Log.d("SeriesButton", "Series button clicked!")
        Toast.makeText(this, "Your offer has been saved.We will contact with you", Toast.LENGTH_SHORT).show()
        Thread.sleep(wait)
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}