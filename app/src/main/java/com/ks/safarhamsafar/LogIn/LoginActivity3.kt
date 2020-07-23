package com.ks.safarhamsafar.LogIn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.ks.safarhamsafar.R

class LoginActivity3 : AppCompatActivity() {

    lateinit var toolBar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login3)

        toolBar=findViewById(R.id.toolbarLogin3)
        setSupportActionBar(toolBar)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

    override fun onSupportNavigateUp(): Boolean{
        onBackPressed()
        return true
    }
}