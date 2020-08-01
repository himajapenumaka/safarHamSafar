package com.ks.safarhamsafar.GoaOffers

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
import com.ks.safarhamsafar.HomePage.GoaOffersRecycler1Adapter
import com.ks.safarhamsafar.OffersFragment.Offers
import com.ks.safarhamsafar.R

class GoaOffersFragment : Fragment() {

    lateinit var toolBar: Toolbar
    lateinit var recyclerview1: RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recycler1Adapter: GoaOffersRecycler1Adapter

    val itemList1=arrayListOf<Offers>(
        Offers("The Park Baga River Goa",R.drawable.pic5),
        Offers("Vivanta Goa, Panaji",R.drawable.pic2),
        Offers("Royal Orchid Beach Resort & Spa",R.drawable.pic9),
        Offers("The Park Baga River Goa",R.drawable.pic5),
        Offers("Vivanta Goa, Panaji",R.drawable.pic2),
        Offers("Royal Orchid Beach Resort & Spa",R.drawable.pic9),
        Offers("Resort Goa",R.drawable.pic9),
        Offers("The Park Baga River Goa",R.drawable.pic5)
        )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(R.layout.fragment_goa_offers, container, false)

        toolBar=view.findViewById(R.id.toolbarGoaOffers)
        (activity as AppCompatActivity).setSupportActionBar(toolBar)
        (activity as AppCompatActivity).supportActionBar?.setHomeButtonEnabled(true)
        (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)

        recyclerview1=view.findViewById(R.id.recycler1GoaOffers)
        layoutManager=LinearLayoutManager(activity as Context)
        recycler1Adapter= GoaOffersRecycler1Adapter(activity as Context,itemList1)

        recyclerview1.layoutManager=layoutManager
        recyclerview1.adapter=recycler1Adapter

        return view
    }

}