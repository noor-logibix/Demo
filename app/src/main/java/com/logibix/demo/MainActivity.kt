package com.logibix.demo

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.logibix.demo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnShowDialog.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setPositiveButton("OK") { dialog, id -> dialog.dismiss() }
            builder.setTitle("Delete")
            builder.setCancelable(false)
            builder.setMessage("Are you sure you want delete it?")
            builder.setNegativeButton("Cancel") {dialog, id -> dialog.cancel()}
            builder.setOnDismissListener {
                val builder2 = AlertDialog.Builder(this)
                builder2.setTitle("Dismiss")
                builder2.create().show()
            }
            builder.setOnCancelListener {
                val builder3 = AlertDialog.Builder(this)
                builder3.setTitle("Cancel")
                builder3.create().show()
            }
            builder.create().show()
        }
    }
}