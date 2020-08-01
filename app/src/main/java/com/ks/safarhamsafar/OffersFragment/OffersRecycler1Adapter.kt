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

class OffersRecycler1Adapter(val context: Context,val itemList: ArrayList<Offers>): RecyclerView.Adapter<OffersRecycler1Adapter.OffersViewHolder1>() {

    class OffersViewHolder1(view: View): RecyclerView.ViewHolder(view){
        val text1: TextView=view.findViewById(R.id.txtsampleOffers)
        val img1: ImageView=view.findViewById(R.id.ImgOffers)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):OffersViewHolder1 {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.recycler1_offers,parent,false)
        return OffersViewHolder1(
            view
        )
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: OffersViewHolder1, position: Int) {
        holder.text1.text=itemList[position].txtName
        holder.img1.setImageResource(itemList[position].imgName)
    }

}