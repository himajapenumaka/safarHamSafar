package com.ks.safarhamsafar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar

class MobileWalletActivity : AppCompatActivity() {

    lateinit var toolBar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mobile_wallet)

        toolBar=findViewById(R.id.toolbarMobileWallet)
        setSupportActionBar(toolBar)
        supportActionBar?.title="Mobile Wallet"
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}