package com.ks.safarhamsafar.Hotels

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ks.safarhamsafar.HomePage.HotelsRecycler1Adapter
import com.ks.safarhamsafar.HomePage.HotelsRecycler2Adapter
import com.ks.safarhamsafar.OffersFragment.Offers
import com.ks.safarhamsafar.R

class HotelsFragment : Fragment() {

    lateinit var toolBar:Toolbar
    lateinit var recycler1View: RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recycler1Adapter: HotelsRecycler1Adapter

    lateinit var recycler2View: RecyclerView
    lateinit var recycler2Adapter: HotelsRecycler2Adapter

    val itemList1=arrayListOf<Offers>(
        Offers("The Park Baga River Goa",R.drawable.pic5),
        Offers("Vivanta Goa, Panaji",R.drawable.pic2),
        Offers("Royal Orchid Beach Resort & Spa",R.drawable.pic9)
    )

    val itemList2=arrayOf<Int>(R.drawable.pic5,R.drawable.pic6,R.drawable.pic9,R.drawable.pic10)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(R.layout.fragment_hotels, container, false)

        toolBar=view.findViewById(R.id.toolbarHotels)
        (activity as AppCompatActivity).setSupportActionBar(toolBar)
        (activity as AppCompatActivity).supportActionBar?.setHomeButtonEnabled(true)
        (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)

        recycler1View=view.findViewById(R.id.recycler1Hotels)
        layoutManager=LinearLayoutManager(activity as Context)
        recycler1Adapter=HotelsRecycler1Adapter(activity as Context,itemList1)

        recycler1View.layoutManager=layoutManager
        recycler1View.adapter=recycler1Adapter

        recycler2View=view.findViewById(R.id.recycler2Hotels)
        recycler2Adapter=HotelsRecycler2Adapter(activity as Context,itemList2)

        recycler2View.adapter=recycler2Adapter

        return view
    }

}