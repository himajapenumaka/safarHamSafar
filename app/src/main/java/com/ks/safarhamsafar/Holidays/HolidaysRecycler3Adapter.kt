package com.ks.safarhamsafar.HomePage

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ks.safarhamsafar.R

class HolidaysRecycler3Adapter(val context: Context,val itemList: Array<String>): RecyclerView.Adapter<HolidaysRecycler3Adapter.HolidaysViewHolder3>() {

    class HolidaysViewHolder3(view: View): RecyclerView.ViewHolder(view){
        val text1: TextView=view.findViewById(R.id.txt1Recycler3Holidays)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolidaysViewHolder3 {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.recycler3_holidays,parent,false)
        return HolidaysViewHolder3(
            view
        )
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: HolidaysViewHolder3, position: Int) {
        holder.text1.text=itemList[position]
    }

}