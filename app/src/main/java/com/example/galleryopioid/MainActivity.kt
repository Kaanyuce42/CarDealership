package com.example.galleryopioid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    private lateinit var carList : ArrayList<Cars>
    private lateinit var carList2 : ArrayList<Cars>
    private lateinit var carList3 : ArrayList<Cars>
    private lateinit var rv : RecyclerView
    private lateinit var rv2 : RecyclerView
    private lateinit var rv3 : RecyclerView
    private lateinit var adapter: CarsRvAdapter
    private lateinit var adapter2: CarsRvAdapter
    private lateinit var adapter3: CarsRvAdapter
    private lateinit var offer: ImageView
    private lateinit var contact: Button
    private lateinit var about: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        contact = findViewById(R.id.button)
        about =findViewById(R.id.button2)
        offer = findViewById(R.id.imageView2)
        rv =findViewById(R.id.recyclerView)
        rv2 =findViewById(R.id.recyclerView2)
        rv3 =findViewById(R.id.recyclerView3)

        rv.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)
        rv2.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)
        rv3.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)

        val i1 = Cars("Ferrari")
        val i2 = Cars("Mercedes-AMG")
        val i3 = Cars("BMW")
        val i4 = Cars("Porsche")
        val i5 = Cars("Audi")
        val i6 = Cars("BMW-SUV")
        carList = ArrayList<Cars>()
        carList2 = ArrayList<Cars>()
        carList3 = ArrayList<Cars>()
        carList.add(i6)
        carList2.add(i1)
        carList2.add(i2)
        carList3.add(i3)
        carList3.add(i4)
        carList3.add(i5)

        adapter = CarsRvAdapter(this,carList)
        adapter2 = CarsRvAdapter(this,carList2)
        adapter3 = CarsRvAdapter(this,carList3)
        rv.adapter = adapter
        rv2.adapter = adapter2
        rv3.adapter = adapter3

        offer.setOnClickListener { view ->
            onSeriesButtonClick(view)
        }
        contact.setOnClickListener { view ->
            onSeriesButtonClick2(view)
        }
        about.setOnClickListener { view ->
            onSeriesButtonClick3(view)
        }
    }

    private fun onSeriesButtonClick(view: View) {



        val intent = Intent(this, OfferActivity::class.java)
        startActivity(intent)
    }
    private fun onSeriesButtonClick2(view: View) {



        val intent = Intent(this, InformationActivity::class.java)
        intent.putExtra("infoname", "contact")
        startActivity(intent)
    }
    private fun onSeriesButtonClick3(view: View) {


        val intent = Intent(this, InformationActivity::class.java)
        intent.putExtra("infoname", "about")
        startActivity(intent)
    }
}