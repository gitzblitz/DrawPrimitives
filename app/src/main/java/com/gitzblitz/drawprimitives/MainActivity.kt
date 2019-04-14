package com.gitzblitz.drawprimitives

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val drawing  = Drawing(this)
        setContentView(R.layout.activity_main)
    }
}
