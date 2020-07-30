package com.ks.safarhamsafar.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.ks.safarhamsafar.R

class SelectRoomActivity : AppCompatActivity() {

    lateinit var toolBar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_room)

        toolBar=findViewById(R.id.toolbarSelectRoom)
        setSupportActionBar(toolBar)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}