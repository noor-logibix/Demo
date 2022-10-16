package com.logibix.demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.logibix.demo.databinding.ActivityMainBinding

const val WIFI_PASSWORD = "wifi_password"

const val IS_DARK = "isDark"

const val CHAR = "char"

const val VALUE = "value"

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        startActivity(Intent(this, SplashActivity::class.java))

        binding.btnNext.setOnClickListener {
            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra(WIFI_PASSWORD, "noor@green")
            intent.putExtra(IS_DARK, true)
            intent.putExtra(CHAR, 'D')
            intent.putExtra(VALUE, 56)
            startActivity(intent)
            finish()
        }

        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}