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

class OffersRecycler2Adapter(val context: Context,val itemList: ArrayList<Offers>): RecyclerView.Adapter<OffersRecycler2Adapter.OffersViewHolder2>() {

    class OffersViewHolder2(view: View): RecyclerView.ViewHolder(view){
        val text1: TextView=view.findViewById(R.id.txtsampleOffers2)
        val img1: ImageView=view.findViewById(R.id.ImgOffers2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):OffersViewHolder2 {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.recycler2_offers,parent,false)
        return OffersViewHolder2(
            view
        )
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: OffersViewHolder2, position: Int) {
        holder.text1.text=itemList[position].txtName
        holder.img1.setImageResource(itemList[position].imgName)
    }

}