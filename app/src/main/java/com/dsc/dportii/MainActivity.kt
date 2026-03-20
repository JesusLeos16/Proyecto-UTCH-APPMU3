package com.dsc.dportii

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNavigationView.selectedItemId = R.id.nav_home

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> true
                R.id.nav_eventos -> {
                    startActivity(Intent(this, TorneoActivity::class.java))
                    finish()
                    true
                }
                R.id.nav_atletas -> {
                    startActivity(Intent(this, AtletasActivity::class.java))
                    finish()
                    true
                }
                else -> false
            }
        }
    }
}