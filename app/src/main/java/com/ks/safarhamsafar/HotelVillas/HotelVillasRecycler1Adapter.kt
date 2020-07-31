package com.ks.safarhamsafar.HomePage

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ks.safarhamsafar.R

class HotelVillasRecycler1Adapter(val context: Context, val itemList: Array<String>): RecyclerView.Adapter<HotelVillasRecycler1Adapter.HotelVillasViewHolder1>() {

    class HotelVillasViewHolder1(view: View): RecyclerView.ViewHolder(view){
        val text1: TextView=view.findViewById(R.id.txtMySafetyRecyclerHotelVillas)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HotelVillasViewHolder1 {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.recycler1_hotel_villas,parent,false)
        return HotelVillasViewHolder1(
            view
        )
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: HotelVillasViewHolder1, position: Int) {
        holder.text1.text=itemList[position]
    }

}