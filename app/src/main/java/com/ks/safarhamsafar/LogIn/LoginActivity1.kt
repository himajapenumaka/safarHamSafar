package com.ks.safarhamsafar.LogIn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.viewpager.widget.ViewPager
import com.ks.safarhamsafar.R
import com.ks.safarhamsafar.Adapters.ViewPagerAdapter
import java.util.*

class LoginActivity1 : AppCompatActivity() {

    lateinit var viewPager: ViewPager
    lateinit var viewPagerAdapter: ViewPagerAdapter
    lateinit var sliderDotsPanel: LinearLayout
    var currentPage: Int=0
    lateinit var timer: Timer
    val DELAY_MS: Long= 3000
    val PERIOD_MS: Long=3000
    lateinit var dots: Array<ImageView>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login1)

        viewPager=findViewById(R.id.viewPager)
        viewPagerAdapter=
            ViewPagerAdapter(this@LoginActivity1)
        viewPager.adapter=viewPagerAdapter
        sliderDotsPanel=findViewById(R.id.sliderDots)

        createDots(0)
        updatePage()

        viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{
            override fun onPageScrollStateChanged(state: Int) {

            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {

            }

            override fun onPageSelected(position: Int) {
                currentPage=position
                createDots(position)
            }
        })

    }

    fun updatePage(){
        var handler= Handler()
        val Update: Runnable= Runnable {
            if(currentPage==viewPagerAdapter.count)
                currentPage=0
            viewPager.setCurrentItem(currentPage++,true)
        }
        timer=Timer()
        timer.schedule(object : TimerTask(){
            override fun run() {
                handler.post(Update)
            }
        },DELAY_MS,PERIOD_MS)
    }

    fun createDots(position: Int){
        if(sliderDotsPanel!=null){
            sliderDotsPanel.removeAllViews()
        }
        dots=Array(viewPagerAdapter.count,{i->ImageView(this)})

        for(i in 0..viewPagerAdapter.count-1){
            dots[i]=ImageView(this)
            if(i==position){
                dots[i].setImageDrawable(ContextCompat.getDrawable(this,
                    R.drawable.active_dot
                ))
            }
            else{
                dots[i].setImageDrawable(ContextCompat.getDrawable(this,
                    R.drawable.non_active_dot
                ))
            }
            var params: LinearLayout.LayoutParams=LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT)
            params.setMargins(8,0,8,0)
            sliderDotsPanel.addView(dots[i],params)
        }
    }

}