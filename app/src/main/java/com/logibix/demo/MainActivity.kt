package com.logibix.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.Toast
import androidx.core.view.get
import androidx.recyclerview.widget.LinearLayoutManager
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

        for (i in 1007..2000) students.add(
            Student(
                (65 + (i % 26)).toChar().toString(),
                (97 + ((i + 5) % 26)).toChar().toString(),
                i
            )
        )


        binding.rvList.layoutManager = LinearLayoutManager(this)
        binding.rvList.adapter = StudentAdapter(students)
    }
}