package com.ks.safarhamsafar.HomePage

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.recyclerview.widget.RecyclerView
import com.ks.safarhamsafar.HomePage.HomeRecycler1Adapter
import com.ks.safarhamsafar.HomePage.HomeRecycler2Adapter
import com.ks.safarhamsafar.HomePage.HomeRecycler3Adapter
import com.ks.safarhamsafar.HomePage.HomeRecycler4Adapter
import com.ks.safarhamsafar.R
import kotlinx.android.synthetic.main.activity_main.*

class HomeFragment : Fragment() {

    lateinit var toolBar: Toolbar

    lateinit var recyclerView1: RecyclerView
    lateinit var recyclerAdapter1: HomeRecycler1Adapter
    lateinit var recyclerView2: RecyclerView
    lateinit var recyclerAdapter2: HomeRecycler2Adapter
    lateinit var recyclerView3: RecyclerView
    lateinit var recyclerAdapter3: HomeRecycler3Adapter
    lateinit var recyclerView4: RecyclerView
    lateinit var recyclerAdapter4: HomeRecycler4Adapter

    val itemList1= arrayOf<String>("Train PNR Status","Live Experiences","Gift Cards","Scan and Pay")
    val itemList2= arrayOf<String>("Taking a domestic flight? Follow these guidelines for safe travel","India - UAE Flights","India - US Flights","AUS - India Flights")
    val itemList3= arrayOf<String>("Tap Here for Hassle-free Outstanding Travel!","Tap Here for Hassle-free Outstanding Travel!","Tap Here for Hassle-free Outstanding Travel!","Tap Here for Hassle-free Outstanding Travel!")
    val itemList4= arrayOf<String>("Get Safar Hamsafar HDFC Bank ForexPlus Card","Get Safar Hamsafar HDFC Bank ForexPlus Card","Get Safar Hamsafar HDFC Bank ForexPlus Card","Get Safar Hamsafar HDFC Bank ForexPlus Card")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_home, container, false)

        toolBar=view.findViewById(R.id.toolbarHome)

        toolBar.setTitleMargin(-10,0,0,0)
        (activity as AppCompatActivity).setSupportActionBar(toolBar)
        (activity as AppCompatActivity).supportActionBar?.setHomeButtonEnabled(true)
        (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var actionBarDrawerToggle= ActionBarDrawerToggle((activity as AppCompatActivity),(activity as AppCompatActivity).drawerLayout,
            R.string.open_drawer,
            R.string.close_drawer
        )
        (activity as AppCompatActivity).drawerLayout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()


        recyclerView1=view.findViewById(R.id.recycler1Home)
        recyclerAdapter1= HomeRecycler1Adapter(
            activity as Context,
            itemList1
        )
        recyclerView1.adapter=recyclerAdapter1

        recyclerView2=view.findViewById(R.id.recycler2Home)
        recyclerAdapter2= HomeRecycler2Adapter(
            activity as Context,
            itemList2
        )
        recyclerView2.adapter=recyclerAdapter2

        recyclerView3=view.findViewById(R.id.recycler3Home)
        recyclerAdapter3= HomeRecycler3Adapter(
            activity as Context,
            itemList3
        )
        recyclerView3.adapter=recyclerAdapter3

        recyclerView4=view.findViewById(R.id.recycler4Home)
        recyclerAdapter4= HomeRecycler4Adapter(
            activity as Context,
            itemList4
        )
        recyclerView4.adapter=recyclerAdapter4

        return view
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id=item.itemId
        if(id == android.R.id.home) {
            drawerLayout.openDrawer(GravityCompat.START)
        }
        return super.onOptionsItemSelected(item)
    }

}