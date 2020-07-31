package com.ks.safarhamsafar.HomePage

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ks.safarhamsafar.R

class HotelVillasRecycler2Adapter(val context: Context, val itemList: Array<String>): RecyclerView.Adapter<HotelVillasRecycler2Adapter.HotelVillasViewHolder2>() {

    class HotelVillasViewHolder2(view: View): RecyclerView.ViewHolder(view){
        val text1: TextView=view.findViewById(R.id.txtsampleHotelVillas)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HotelVillasViewHolder2 {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.recycler2_hotel_villas,parent,false)
        return HotelVillasViewHolder2(
            view
        )
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: HotelVillasViewHolder2, position: Int) {
        holder.text1.text=itemList[position]
    }

}