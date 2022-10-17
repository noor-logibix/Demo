package com.logibix.demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.logibix.demo.databinding.ActivityMainBinding
import kotlin.math.log

const val WIFI_PASSWORD = "wifi_password"

const val IS_DARK = "isDark"

const val CHAR = "char"

const val VALUE = "value"

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val TAG = "LIFE_CYCLE: ${this::class.java.simpleName}"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d(TAG, "onCreate: ")

        startActivity(Intent(this, SplashActivity::class.java))

        binding.btnNext.setOnClickListener {
            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra(WIFI_PASSWORD, "noor@green")
            intent.putExtra(IS_DARK, true)
            intent.putExtra(CHAR, 'D')
            intent.putExtra(VALUE, 56)
            startActivity(intent)
        }

        binding.btnBack.setOnClickListener {
            finish()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: ")
    }
    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: ")
    }
}