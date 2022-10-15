package com.logibix.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import com.logibix.demo.databinding.ActivityMainBinding
import com.logibix.demo.databinding.AddStudentDialogBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val students = ArrayList<Student>()

        binding.fabAdd.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val dialogBinding = AddStudentDialogBinding.inflate(layoutInflater)
            val dialog = builder.setView(dialogBinding.root).create()

            dialogBinding.btnAdd.setOnClickListener {
                students.add(Student(
                    dialogBinding.etName.text.toString(),
                    dialogBinding.etClass.text.toString(),
                    dialogBinding.etRollNumber.text.toString().toInt()
                ))
                dialog.dismiss()
            }

            dialogBinding.btnCancel.setOnClickListener {
                dialog.dismiss()
            }
            dialog.show()
        }

        binding.rvList.layoutManager = LinearLayoutManager(this)
        binding.rvList.adapter = StudentAdapter(students)
    }
}