package com.ks.safarhamsafar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar

class AmazonPayActivity : AppCompatActivity() {

    lateinit var toolBar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amazon_pay)

        toolBar=findViewById(R.id.toolbarAmazonPay)
        setSupportActionBar(toolBar)
        supportActionBar?.title="Amazon Pay"
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}