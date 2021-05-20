package com.ks.safarhamsafar.Activities

import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import com.ks.safarhamsafar.Fragments.OfferCategoryFragment
import com.ks.safarhamsafar.HomePage.HomeFragment
import com.ks.safarhamsafar.GoaOffers.GoaOffersFragment
import com.ks.safarhamsafar.Hotels.HotelsFragment
import com.ks.safarhamsafar.OffersFragment.OffersFragment
import com.ks.safarhamsafar.R


class MainActivity : AppCompatActivity() {

    lateinit var navigationView: NavigationView
    lateinit var drawerLayout: DrawerLayout
    lateinit var frameLayout: FrameLayout
    lateinit var toolBar: Toolbar
    lateinit var bottom_nav_main: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigationView=findViewById(R.id.navigationView)
        drawerLayout=findViewById(R.id.drawerLayout)
        frameLayout=findViewById(R.id.frameLayout)
        bottom_nav_main=findViewById(R.id.bottom_navigation_main)

        bottom_nav_main.itemIconTintList=null

        openHomeFragment()
        bottom_nav_main.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home_bnv -> {
                    supportFragmentManager.beginTransaction().replace(
                        R.id.frameLayout,
                        HomeFragment()
                    ).commit()
                }

                R.id.myTrips_bnv -> {
                    supportFragmentManager.beginTransaction().replace(
                        R.id.frameLayout,
                        HotelsFragment()
                    ).commit()
                }

                R.id.offers_bnv->{
                    supportFragmentManager.beginTransaction().replace(
                        R.id.frameLayout,
                        OffersFragment()
                    ).commit()
                }

            }

            return@setOnNavigationItemSelectedListener true

        }

    }

    fun openHomeFragment(){
            supportFragmentManager.beginTransaction().replace(
                R.id.frameLayout,
                HomeFragment()
            ).commit()
    }

}