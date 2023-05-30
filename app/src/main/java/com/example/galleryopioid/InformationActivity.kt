package com.example.galleryopioid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class InformationActivity : AppCompatActivity() {
    private lateinit var text : TextView
    private lateinit var info : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information)
        text = findViewById(R.id.textView5)

        if (intent.hasExtra("infoname")) {
            info = intent.getStringExtra("infoname")!!
        }

        if(info.equals("contact")) {
            text.setText("CONTACT US\n" +
                "\n" +
                        "+ 90 553 458 81 75\n" +
                        "\n" +
                        "info@gallery-opioid.com\n")
        }
        if (info.equals("about")) {
            text.setText("Gallery Opioid is an auto showroom of special models. It is located in İstiklal, Beyoğlu. All of the pieces are expertized and taken originality approve. Offers are only considering via phone or face to face. We are serving your vehicles, anywhere around the World. As a firm, our vision is gathering the right person to right ride for pleasure of driving. "
            )
        }
    }
}



