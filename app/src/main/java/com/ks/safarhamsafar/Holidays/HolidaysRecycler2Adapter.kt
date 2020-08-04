package com.ks.safarhamsafar.HomePage

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ks.safarhamsafar.R

class HolidaysRecycler2Adapter(val context: Context,val itemList: Array<Int>): RecyclerView.Adapter<HolidaysRecycler2Adapter.HolidaysViewHolder2>() {

    class HolidaysViewHolder2(view: View): RecyclerView.ViewHolder(view){
        val img1: ImageView=view.findViewById(R.id.img1Recycler2Holidays)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolidaysViewHolder2 {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.recycler2_holidays,parent,false)
        return HolidaysViewHolder2(
            view
        )
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: HolidaysViewHolder2, position: Int) {
        holder.img1.setImageResource(itemList[position])
    }

}