package com.example.galleryopioid

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class CarsRvAdapter(private val mContext: Context, private val carList: List<Cars>) : RecyclerView.Adapter<CarsRvAdapter.CardViewDesignObjectHolder>() {

    inner class CardViewDesignObjectHolder(view: View): RecyclerView.ViewHolder(view) {
        var CardView: CardView
        var text: TextView
        var cardImage: ImageView
        init {
            CardView = view.findViewById(R.id.CardView)
            text = view.findViewById(R.id.textt)
            cardImage=view.findViewById(R.id.imageView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewDesignObjectHolder {

        val design = LayoutInflater.from(mContext).inflate(R.layout.cardview,parent,false)
        return  CardViewDesignObjectHolder(design)
    }



    override fun getItemCount(): Int {
        return carList.size
    }

    override fun onBindViewHolder(
        holder: CarsRvAdapter.CardViewDesignObjectHolder,
        position: Int
    ) {
        val cars = carList[position]
        holder.text.setText(cars.name)
        if (cars.name=="BMW") {
            holder.cardImage.setBackgroundResource(R.drawable.bmw)


        }
        if (cars.name=="Ferrari") {
            holder.cardImage.setBackgroundResource(R.drawable.sport)

        }
        if (cars.name.equals("Mercedes-AMG")) {
            holder.cardImage.setBackgroundResource(R.drawable.amg)

        }
        if (cars.name=="Porsche") {
            holder.cardImage.setBackgroundResource(R.drawable.porsche)

        }
        if (cars.name=="Audi") {
            holder.cardImage.setBackgroundResource(R.drawable.audi)

        }
        if (cars.name=="BMW-SUV") {
            holder.cardImage.setBackgroundResource(R.drawable.bmwsuv)
        }
        holder.CardView.setOnClickListener(View.OnClickListener {
            val intent = Intent(mContext, CarActivity::class.java)
            intent.putExtra("carname", cars.name)
            mContext.startActivity(intent)
        })
    }
}