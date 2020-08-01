package com.ks.safarhamsafar.OffersFragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ks.safarhamsafar.HomePage.OffersRecycler1Adapter
import com.ks.safarhamsafar.HomePage.OffersRecycler2Adapter
import com.ks.safarhamsafar.R


class OffersFragment : Fragment() {

    lateinit var toolBar: Toolbar
    lateinit var recyclerView1: RecyclerView
    lateinit var layoutManager1: RecyclerView.LayoutManager
    lateinit var recycler1Adapter: OffersRecycler1Adapter

    lateinit var recyclerView2: RecyclerView
    lateinit var layoutManager2: RecyclerView.LayoutManager
    lateinit var recycler2Adapter: OffersRecycler2Adapter

    val itemList1= arrayListOf<Offers>(
        Offers("Rs. 1000 Instant Discount Every Tuesday!",R.drawable.pic1),
        Offers("Upto Rs. 1450 Cashback Every Monday!",R.drawable.pic2),
        Offers("Rs. 1000 Instant Discount Every Tuesday!",R.drawable.pic3),
        Offers("Rs. 1000 Instant Discount Every Tuesday!",R.drawable.pic4),
        Offers("Rs. 1000 Instant Discount Every Tuesday!",R.drawable.pic5),
        Offers("Upto Rs. 1450 Cashback Every Monday!",R.drawable.pic6),
        Offers("Rs. 1000 Instant Discount Every Tuesday!",R.drawable.pic7),
        Offers("Rs. 1000 Instant Discount Every Tuesday!",R.drawable.pic8),
        Offers("Rs. 1000 Instant Discount Every Tuesday!",R.drawable.pic9),
        Offers("Upto Rs. 1450 Cashback Every Monday!",R.drawable.pic10),
        Offers("Rs. 1000 Instant Discount Every Tuesday!",R.drawable.pic6),
        Offers("Rs. 1000 Instant Discount Every Tuesday!",R.drawable.pic1),
        Offers("Rs. 1000 Instant Discount Every Tuesday!",R.drawable.pic4),
        Offers("Upto Rs. 1450 Cashback Every Monday!",R.drawable.pic7)
    )

    val itemList2= arrayListOf<Offers>(
        Offers("Rs. 1000 Instant Discount Every Tuesday!",R.drawable.pic1),
        Offers("Upto Rs. 1450 Cashback Every Monday!",R.drawable.pic2),
        Offers("Upto Rs. 1450 Cashback Every Monday!",R.drawable.pic3),
        Offers("Rs. 1000 Instant Discount Every Tuesday!",R.drawable.pic4),
        Offers("Rs. 1000 Instant Discount Every Tuesday!",R.drawable.pic5),
        Offers("Upto Rs. 1450 Cashback Every Monday!",R.drawable.pic6)
        )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_offers, container, false)

        toolBar=view.findViewById(R.id.toolbarOffers)

        (activity as AppCompatActivity).setSupportActionBar(toolBar)
        (activity as AppCompatActivity).supportActionBar?.setHomeButtonEnabled(true)
        (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)

        recyclerView1=view.findViewById(R.id.recycler1Offers)
        layoutManager1=GridLayoutManager(activity as Context,2)
        recycler1Adapter= OffersRecycler1Adapter(activity as Context,itemList1)
        recyclerView1.layoutManager=layoutManager1
        recyclerView1.adapter=recycler1Adapter

        recyclerView2=view.findViewById(R.id.recycler2Offers)
        layoutManager2=GridLayoutManager(activity as Context,2)
        recycler2Adapter= OffersRecycler2Adapter(activity as Context,itemList2)
        recyclerView2.layoutManager=layoutManager2
        recyclerView2.adapter=recycler2Adapter

        return view
    }

}