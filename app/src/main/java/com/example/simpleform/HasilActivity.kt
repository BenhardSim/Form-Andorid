package com.example.simpleform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class HasilActivity : AppCompatActivity(), View.OnClickListener {

    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_TEMPAT = "extra_tempat"
        const val EXTRA_TGL = "extra_tanggal"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)

        val btnBack: Button = findViewById(R.id.btn_back)
        btnBack.setOnClickListener(this)

        val tvDataReceived: TextView = findViewById(R.id.tv_data_received)

        val name = intent.getStringExtra(EXTRA_NAME)
        val tempat = intent.getStringExtra(EXTRA_TEMPAT)
        val tanggal = intent.getStringExtra(EXTRA_TGL)

        val text = "Nama: $name \nLahir Di: $tempat Tanggal: $tanggal"
        tvDataReceived.text = text
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_back -> {
                val moveHasilMainIntent = Intent(this@HasilActivity, MainActivity::class.java)
                startActivity(moveHasilMainIntent)
            }
        }
    }
}