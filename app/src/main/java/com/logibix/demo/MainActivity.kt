package com.logibix.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.core.view.get
import com.logibix.demo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val students = arrayListOf<Student>()

        students.add(Student("Shan", "Grad", 1001))
        students.add(Student("Shub", "Madhyamik", 1002))
        students.add(Student("Anu", "Twelve", 1003))
        students.add(Student("Noor", "A", 1004))
        students.add(Student("XYhan", "C", 1006))

        val adapter = CustomAdapter(this, students)
        binding.lvList.adapter = adapter
        binding.lvList.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, "Item is clicked", Toast.LENGTH_SHORT).show()
        }
    }
}