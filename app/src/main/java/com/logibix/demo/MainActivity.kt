package com.logibix.demo

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.logibix.demo.databinding.ActivityMainBinding
import java.util.*
import kotlin.streams.asSequence

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val samples = arrayListOf<Sample>()

        for (i in 1000..2000) samples.add(
            Sample(
                getRandomColour(),
                getRandomText(),
                i
            )
        )
        binding.rvList.layoutManager = LinearLayoutManager(this)
        binding.rvList.adapter = SampleAdapter(samples)
    }

    private fun getRandomColour(): Int {
        val rnd = Random()
        return Color.argb(
            255,
            rnd.nextInt(256),
            rnd.nextInt(256),
            rnd.nextInt(256)
        )
    }

    private fun getRandomText(): String {
        val source = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        return Random().ints(10, 0, source.length)
            .asSequence()
            .map(source::get)
            .joinToString("")
    }
}