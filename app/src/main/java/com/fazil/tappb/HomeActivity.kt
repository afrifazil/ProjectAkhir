package com.fazil.tappb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        
        val actButton= findViewById<Button>(R.id.btnh_back)
        val actButton1= findViewById<Button>(R.id.btn_job)
        val actButton2= findViewById<Button>(R.id.btn_ref)
        val actButton3= findViewById<Button>(R.id.btn_profil)
        
        actButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        actButton1.setOnClickListener {
            val intent = Intent(this, JobActivity::class.java)
            startActivity(intent)
        }

        actButton2.setOnClickListener {
            val intent = Intent(this, RefActivity::class.java)
            startActivity(intent)
        }

        actButton3.setOnClickListener {
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }
    }
}