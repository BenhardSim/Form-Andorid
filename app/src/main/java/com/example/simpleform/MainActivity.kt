package com.example.simpleform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnSubmit: Button = findViewById(R.id.btn_submit)
        btnSubmit.setOnClickListener(this)

        val btnBack: Button = findViewById(R.id.btn_kembali)
        btnBack.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_kembali->{
                val moveMainHasilIntent = Intent(this@MainActivity, WelcomeActivity::class.java)
                startActivity(moveMainHasilIntent)
            }

            R.id.btn_submit -> {
                val moveMainHasilIntent = Intent(this@MainActivity, HasilActivity::class.java)
                val inputanNama: EditText = findViewById(R.id.input_nama)
                val inputanTempat: EditText = findViewById(R.id.input_tempat_lahir)
                val inputanTanggal: EditText = findViewById(R.id.input_tanggal_lahir)
                moveMainHasilIntent.putExtra(HasilActivity.EXTRA_NAME, inputanNama.getText().toString())
                moveMainHasilIntent.putExtra(HasilActivity.EXTRA_TEMPAT, inputanTempat.getText().toString())
                moveMainHasilIntent.putExtra(HasilActivity.EXTRA_TGL, inputanTanggal.getText().toString())
                startActivity(moveMainHasilIntent)
            }
        }
    }
}