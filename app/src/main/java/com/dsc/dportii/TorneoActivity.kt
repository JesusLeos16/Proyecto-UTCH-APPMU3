package com.dsc.dportii

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class TorneoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_torneo)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavTorneos)
        bottomNavigationView.selectedItemId = R.id.nav_eventos

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    startActivity(Intent(this, MainActivity::class.java))
                    finish()
                    true
                }
                R.id.nav_eventos -> true
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