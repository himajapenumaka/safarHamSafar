package com.ks.safarhamsafar.HomePage

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ks.safarhamsafar.R

class HomeRecycler1Adapter(val context: Context,val itemList: Array<String>): RecyclerView.Adapter<HomeRecycler1Adapter.HomeViewHolder1>() {

    class HomeViewHolder1(view: View): RecyclerView.ViewHolder(view){
        val text1: TextView=view.findViewById(R.id.txtrecycler1Home)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder1 {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.recycler1_home,parent,false)
        return HomeViewHolder1(
            view
        )
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: HomeViewHolder1, position: Int) {
        holder.text1.text=itemList[position]
    }

}