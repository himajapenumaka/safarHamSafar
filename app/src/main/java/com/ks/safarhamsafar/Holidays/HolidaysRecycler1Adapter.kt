package com.ks.safarhamsafar.HomePage

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ks.safarhamsafar.R

class HolidaysRecycler1Adapter(val context: Context,val itemList: Array<String>): RecyclerView.Adapter<HolidaysRecycler1Adapter.HolidaysViewHolder1>() {

    class HolidaysViewHolder1(view: View): RecyclerView.ViewHolder(view){
        val text1: TextView=view.findViewById(R.id.txt1holidays)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolidaysViewHolder1 {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.recycler1_holidays,parent,false)
        return HolidaysViewHolder1(
            view
        )
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: HolidaysViewHolder1, position: Int) {
        holder.text1.text=itemList[position]
    }

}