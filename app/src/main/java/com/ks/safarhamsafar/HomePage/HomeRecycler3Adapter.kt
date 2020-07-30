package com.ks.safarhamsafar.HomePage

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ks.safarhamsafar.R

class HomeRecycler3Adapter(val context: Context,val itemList: Array<String>): RecyclerView.Adapter<HomeRecycler3Adapter.HomeViewHolder3>() {

    class HomeViewHolder3(view: View): RecyclerView.ViewHolder(view){
        val text1: TextView=view.findViewById(R.id.txtTapHere1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder3 {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.recycler3_home,parent,false)
        return HomeViewHolder3(
            view
        )
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: HomeViewHolder3, position: Int) {
        holder.text1.text=itemList[position]
    }

}