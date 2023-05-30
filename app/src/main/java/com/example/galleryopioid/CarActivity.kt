package com.example.galleryopioid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class CarActivity : AppCompatActivity() {
    private lateinit var imagecar : ImageView
    private lateinit var textcar : TextView
    private lateinit var carName : String
    private lateinit var textViewCar : TextView
    private lateinit var buttonOffer : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_car)

        textViewCar = findViewById(R.id.textViewCar)
        buttonOffer = findViewById(R.id.button4)

        textViewCar.setText("Information of the Car ")
        if (intent.hasExtra("carname")) {
            carName = intent.getStringExtra("carname")!!
        }
        imagecar = findViewById(R.id.imagecar)
        textcar = findViewById(R.id.textcar)

        if(carName.equals("BMW-SUV")) {
            imagecar.setBackgroundResource(R.drawable.bmwsuv)
            textcar.setText(
                    "Year: 2023\n" +
                    "Manufacturer: BMW\n" +
                    "Model: X5 M \n" +
                    "Horsepower: 600 hp\n" +
                    "Engine: 4.4 V8\n" +
                    "Odometer: 10000 km\n")

        }
        if(carName.equals("BMW")) {
            imagecar.setBackgroundResource(R.drawable.bmw)
            textcar.setText(
                    "Year: 2008\n" +
                    "Manufacturer: BMW\n" +
                    "Model: M5 \n" +
                    "Horsepower: 500 hp\n" +
                    "Engine: 5.0 V10\n" +
                    "Odometer: 60000 km\n")
        }
        if(carName.equals("Ferrari")) {
            imagecar.setBackgroundResource(R.drawable.sport)
            textcar.setText(
                    "Year: 2004\n" +
                    "Manufacturer: Ferrari\n" +
                    "Model: Enzo\n" +
                    "Horsepower: 651 hp\n" +
                    "Engine: 6.0 V12\n" +
                    "Odometer: 19500 km\n")
        }
        if(carName.equals("Mercedes-AMG")) {
            imagecar.setBackgroundResource(R.drawable.amg)
            textcar.setText(
                    "Year: 2012\n" +
                    "Manufacturer: Mercedes-AMG\n" +
                    "Model: SLS AMG\n" +
                    "Horsepower: 563 hp\n" +
                    "Engine: 6.2 V8\n" +
                    "Odometer: 45750 km\n")
        }
        if(carName.equals("Porsche")) {
            imagecar.setBackgroundResource(R.drawable.porsche)
            textcar.setText(
                    "Year: 2019\n" +
                    "Manufacturer: Porsche\n" +
                    "Model: Panamera Turbo\n" +
                    "Horsepower: 541 hp\n" +
                    "Engine: 4.0 V8\n" +
                    "Odometer: 25000 km\n")
        }

        if(carName.equals("Audi")) {
            imagecar.setBackgroundResource(R.drawable.audi)
            textcar.setText(
                    "Year: 2023\n" +
                    "Manufacturer: Audi\n" +
                    "Model: E-Tron GT RS\n" +
                    "Horsepower: 598 hp\n" +
                    "Engine: Electric\n" +
                    "Odometer: 7000 km\n")
        }


        buttonOffer.setOnClickListener{
            val intent = Intent(this, OfferActivity::class.java)
            startActivity(intent)
        }
    }
}