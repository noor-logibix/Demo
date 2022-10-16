package com.logibix.demo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.logibix.demo.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val pass = intent.extras?.getString(WIFI_PASSWORD)
        val isDar = intent.extras?.getBoolean(IS_DARK)
        val value = intent.extras?.getInt(VALUE)
        val char = intent.extras?.getChar(CHAR, 'H')

        binding.tvText.text = "$pass, $isDar, $value, $char"

        binding.btnPrevious.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.btnBack.setOnClickListener {
            finish()
        }

    }
}