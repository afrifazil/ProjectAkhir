package com.fazil.tappb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class JobActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_job)

        val actButton= findViewById<Button>(R.id.btnj_back)
        val actButton1= findViewById<Button>(R.id.btn_j1)
        val actButton2= findViewById<Button>(R.id.btn_j2)

        actButton.setOnClickListener {
            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }

        actButton1.setOnClickListener {
            val intent = Intent(this, JobisiActivity::class.java)
            startActivity(intent)
        }

        actButton2.setOnClickListener {
            val intent = Intent(this, Jobisi2Activity::class.java)
            startActivity(intent)
        }
    }
}