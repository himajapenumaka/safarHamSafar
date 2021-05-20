package com.ks.safarhamsafar.LogIn

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.ks.safarhamsafar.R

class ViewPagerAdapter(val context: Context): PagerAdapter() {

    lateinit var layoutInflater: LayoutInflater
    var images= arrayOf<Int>(
        R.drawable.login_img1,
        R.drawable.login_img2
    )

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view==`object`
    }

    override fun getCount(): Int {
        return images.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view: View=layoutInflater.inflate(R.layout.view_pager_layout,null)
        val imageViewPager: ImageView = view.findViewById(R.id.imageViewPager)
        imageViewPager.setImageResource(images[position])

        val vp: ViewPager=container as ViewPager
        vp.addView(view,0)
        return view

    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {

        val vp:ViewPager=container as ViewPager
        val view:View=`object` as View
        vp.removeView(view)

    }
}