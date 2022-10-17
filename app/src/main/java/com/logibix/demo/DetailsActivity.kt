package com.logibix.demo

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.logibix.demo.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    lateinit var binding: ActivityDetailsBinding
    private val TAG = "LIFE_CYCLE: ${this::class.java.simpleName}"

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
            finish()
        }

        binding.btnBack.setOnClickListener {
            finish()
        }
        Log.d(TAG, "onCreate: ")

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