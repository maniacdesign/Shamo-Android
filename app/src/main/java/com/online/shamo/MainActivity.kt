package com.online.shamo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.google.android.material.bottomnavigation.BottomNavigationItemView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val BottomNavigationItemView = findViewById<BottomNavigationItemView>(R.id.bottomNav)
        val navController = findNavController(R.id.homeFragment)

        BottomNavigationItemView
    }
}