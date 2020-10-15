package com.example.testevideo

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("ggg","jjjj")
    }

    override fun onPause() {
        super.onPause()
        Log.d(  "****TAG", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("****TAG", "onStop")
    }

    override fun onStart() {
        super.onStart()
        Log.d( "****TAG", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d( "****TAG", "onResume")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d( "****TAG", "onDestroy")
    }
}