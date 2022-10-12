package com.logibix.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.logibix.demo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var names = arrayListOf<Char>()

        for (ch in 'A'..'Z') names.add(ch)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, names)
        binding.lvList.adapter = adapter
    }
}