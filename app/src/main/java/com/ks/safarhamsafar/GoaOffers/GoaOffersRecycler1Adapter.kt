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

class GoaOffersRecycler1Adapter(val context: Context, val itemList: ArrayList<Offers>): RecyclerView.Adapter<GoaOffersRecycler1Adapter.GoaOffersViewHolder1>() {

    class GoaOffersViewHolder1(view: View): RecyclerView.ViewHolder(view){
        val img1: ImageView =view.findViewById(R.id.img1GoaOffers)
        val text1: TextView=view.findViewById(R.id.txt1GoaOffers)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GoaOffersViewHolder1 {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.recycler1_goa_offers,parent,false)
        return GoaOffersViewHolder1(
            view
        )
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: GoaOffersViewHolder1, position: Int) {
        holder.text1.text=itemList[position].txtName
        holder.img1.setImageResource(itemList[position].imgName)
    }

}