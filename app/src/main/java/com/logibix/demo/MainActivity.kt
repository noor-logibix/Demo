package com.logibix.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.logibix.demo.databinding.ActivityMainBinding

private const val MY_PREF = "myPref"

private const val NAME = "name"

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val preferences = getSharedPreferences(MY_PREF, MODE_PRIVATE)
        val name = preferences.getString(NAME, "Null")

        binding.tvText.text = "Hello $name"

        binding.btnSave.setOnClickListener {
            val preferences = getSharedPreferences(MY_PREF, MODE_PRIVATE)
            val editor = preferences.edit()
            editor .putString(NAME, binding.etName.text.toString())
            editor.apply()
            binding.tvText.text = "Hello ${binding.etName.text}"
        }
    }
}


