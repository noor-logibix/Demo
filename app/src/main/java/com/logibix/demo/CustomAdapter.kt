package com.logibix.demo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.logibix.demo.databinding.ListItemBinding

class CustomAdapter(context: Context, val students: ArrayList<Student>) :
    ArrayAdapter<Student>(context, R.layout.list_item, students) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val binding = ListItemBinding.inflate(LayoutInflater.from(context))
        binding.tvName.text = students[position].name
        binding.tvStandard.text = students[position].standard
        binding.tvRollNo.text = students[position].rollNo.toString()
        return binding.root
    }
}