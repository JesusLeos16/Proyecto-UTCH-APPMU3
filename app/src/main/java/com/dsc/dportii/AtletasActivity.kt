package com.dsc.dportii

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class AtletasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_atletas)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavParticipantes)
        bottomNavigationView.selectedItemId = R.id.nav_atletas

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    startActivity(Intent(this, MainActivity::class.java))
                    finish()
                    true
                }
                R.id.nav_eventos -> {
                    startActivity(Intent(this, TorneoActivity::class.java))
                    finish()
                    true
                }
                R.id.nav_atletas -> true
                else -> false
            }
        }
    }
}