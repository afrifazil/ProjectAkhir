package com.fazil.tappb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val actButton1= findViewById<Button>(R.id.l_btn_back)
        val actButton2= findViewById<Button>(R.id.l_btn_log)

        actButton1.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        actButton2.setOnClickListener{
            val  intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}