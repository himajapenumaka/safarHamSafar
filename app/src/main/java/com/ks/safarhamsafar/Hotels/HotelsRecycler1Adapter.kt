package com.ks.safarhamsafar.HomePage

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ks.safarhamsafar.OffersFragment.Offers
import com.ks.safarhamsafar.R

class HotelsRecycler1Adapter(val context: Context, val itemList: ArrayList<Offers>): RecyclerView.Adapter<HotelsRecycler1Adapter.HotelsViewHolder1>() {

    class HotelsViewHolder1(view: View): RecyclerView.ViewHolder(view){
        val img1: ImageView =view.findViewById(R.id.img1Hotels)
        val text1: TextView=view.findViewById(R.id.txt1Hotels)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HotelsViewHolder1 {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.recycler1_hotels,parent,false)
        return HotelsViewHolder1(
            view
        )
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: HotelsViewHolder1, position: Int) {
        holder.text1.text=itemList[position].txtName
        holder.img1.setImageResource(itemList[position].imgName)
    }

}