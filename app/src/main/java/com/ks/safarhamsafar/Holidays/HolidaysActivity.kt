package com.ks.safarhamsafar.Holidays

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView
import com.ks.safarhamsafar.HomePage.HolidaysRecycler1Adapter
import com.ks.safarhamsafar.HomePage.HolidaysRecycler2Adapter
import com.ks.safarhamsafar.HomePage.HolidaysRecycler3Adapter
import com.ks.safarhamsafar.R

class HolidaysActivity : AppCompatActivity() {

    lateinit var toolBar: Toolbar
    lateinit var recycler1View: RecyclerView
    lateinit var recycler1Adapter: HolidaysRecycler1Adapter

    lateinit var recycler2View: RecyclerView
    lateinit var recycler2Adapter: HolidaysRecycler2Adapter

    lateinit var recycler3View: RecyclerView
    lateinit var recycler3Adapter: HolidaysRecycler3Adapter

    lateinit var recycler4View: RecyclerView
    lateinit var recycler4Adapter: HolidaysRecycler2Adapter

    lateinit var recycler5View: RecyclerView
    lateinit var recycler5Adapter: HolidaysRecycler2Adapter

    lateinit var recycler6View: RecyclerView
    lateinit var recycler6Adapter: HolidaysRecycler2Adapter

    lateinit var recycler7View: RecyclerView
    lateinit var recycler7Adapter: HolidaysRecycler2Adapter

    lateinit var recycler8View: RecyclerView
    lateinit var recycler8Adapter: HolidaysRecycler2Adapter

    val itemList1=arrayOf<String>("Secure #EpicTrips with Future Holiday Travel Vouchers!","Secure #EpicTrips with Future Holiday Travel Vouchers!","Secure #EpicTrips with Future Holiday Travel Vouchers!")
    val itemList2=arrayOf<Int>(R.drawable.pic2,R.drawable.pic3,R.drawable.pic4,R.drawable.pic9)
    val itemList3=arrayOf<String>("Pre-book your holiday for Rs. 1000. Enjoy free cancellation upto 72 hours before travel & more","Book your holiday with Easy EMI options","Pre-book your holiday for Rs. 1000. Enjoy free cancellation upto 72 hours before travel & more","Book your holiday with Easy EMI options")
    val itemList4=arrayOf<Int>(R.drawable.pic5,R.drawable.pic2,R.drawable.pic3,R.drawable.pic8)
    val itemList5=arrayOf<Int>(R.drawable.pic2,R.drawable.pic8)
    val itemList6=arrayOf<Int>(R.drawable.pic3,R.drawable.pic4,R.drawable.pic6,R.drawable.pic9)
    val itemList7=arrayOf<Int>(R.drawable.pic4,R.drawable.pic3,R.drawable.pic2,R.drawable.pic7)
    val itemList8=arrayOf<Int>(R.drawable.pic6,R.drawable.pic1,R.drawable.pic3,R.drawable.pic9)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_holidays)

        toolBar=findViewById(R.id.toolbarHolidays)
        setSupportActionBar(toolBar)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        recycler1View=findViewById(R.id.recycler1_holidays)
        recycler1Adapter= HolidaysRecycler1Adapter(this@HolidaysActivity, itemList1)
        recycler1View.adapter=recycler1Adapter

        recycler2View=findViewById(R.id.recycler2_holidays)
        recycler2Adapter= HolidaysRecycler2Adapter(this,itemList2)
        recycler2View.adapter=recycler2Adapter

        recycler3View=findViewById(R.id.recycler3_holidays)
        recycler3Adapter= HolidaysRecycler3Adapter(this,itemList3)
        recycler3View.adapter=recycler3Adapter

        recycler4View=findViewById(R.id.recycler4_holidays)
        recycler4Adapter= HolidaysRecycler2Adapter(this,itemList4)
        recycler4View.adapter=recycler4Adapter

        recycler5View=findViewById(R.id.recycler5_holidays)
        recycler5Adapter= HolidaysRecycler2Adapter(this,itemList5)
        recycler5View.adapter=recycler5Adapter

        recycler6View=findViewById(R.id.recycler6_holidays)
        recycler6Adapter= HolidaysRecycler2Adapter(this,itemList6)
        recycler6View.adapter=recycler6Adapter

        recycler7View=findViewById(R.id.recycler7_holidays)
        recycler7Adapter= HolidaysRecycler2Adapter(this,itemList7)
        recycler7View.adapter=recycler7Adapter

        recycler8View=findViewById(R.id.recycler8_holidays)
        recycler8Adapter= HolidaysRecycler2Adapter(this,itemList8)
        recycler8View.adapter=recycler8Adapter

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}