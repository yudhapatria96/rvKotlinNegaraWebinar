package com.recyclerview

import  android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_mulai.*

class MulaiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mulai)

        btnMulai.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this@MulaiActivity, MainActivity::class.java))
        })
    }
}