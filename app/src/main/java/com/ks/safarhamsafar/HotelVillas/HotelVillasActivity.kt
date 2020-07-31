package com.ks.safarhamsafar.HotelVillas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView
import com.ks.safarhamsafar.HomePage.HotelVillasRecycler1Adapter
import com.ks.safarhamsafar.HomePage.HotelVillasRecycler2Adapter
import com.ks.safarhamsafar.R

class HotelVillasActivity : AppCompatActivity() {

    lateinit var toolBar: Toolbar
    lateinit var recyclerView1: RecyclerView
    lateinit var recycler1Adapter: HotelVillasRecycler1Adapter

    lateinit var recyclerView2: RecyclerView
    lateinit var recycler2Adapter: HotelVillasRecycler2Adapter

    val itemList1= arrayOf<String>("MySafety","My Safety","MySafetyyy")
    val itemList2= arrayOf<String>("Book Luxurious Staycations Near & Grab Great Benefits!","Book Luxurious Staycations Near & Grab Great Benefits!","Book Luxurious Staycations Near & Grab Great Benefits!")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hotel_villas)

        toolBar=findViewById(R.id.toolbarHotelVillas)
        setSupportActionBar(toolBar)
        supportActionBar?.title="Hotel, Villas, Apts & more"
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        recyclerView1=findViewById(R.id.recycler1HotelVillas)
        recycler1Adapter= HotelVillasRecycler1Adapter(this,itemList1)
        recyclerView1.adapter=recycler1Adapter

        recyclerView2=findViewById(R.id.recycler2HotelVillas)
        recycler2Adapter= HotelVillasRecycler2Adapter(this,itemList2)
        recyclerView2.adapter=recycler2Adapter

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}