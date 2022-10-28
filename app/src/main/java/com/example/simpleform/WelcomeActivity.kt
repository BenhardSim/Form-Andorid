package com.example.simpleform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class WelcomeActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val btnStart: Button = findViewById(R.id.btn_start)
        btnStart.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_start -> {
                val moveMainHasilIntent = Intent(this@WelcomeActivity, MainActivity::class.java)
                startActivity(moveMainHasilIntent)
            }
        }
    }
}