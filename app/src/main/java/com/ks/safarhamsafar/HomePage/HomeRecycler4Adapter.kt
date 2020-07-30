package com.ks.safarhamsafar.HomePage

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ks.safarhamsafar.R

class HomeRecycler4Adapter(val context: Context,val itemList: Array<String>): RecyclerView.Adapter<HomeRecycler4Adapter.HomeViewHolder4>() {

    class HomeViewHolder4(view: View): RecyclerView.ViewHolder(view){
        val text1: TextView=view.findViewById(R.id.recycler4text1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder4 {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.recycler4_home,parent,false)
        return HomeViewHolder4(
            view
        )
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: HomeViewHolder4, position: Int) {
        holder.text1.text=itemList[position]
    }

}