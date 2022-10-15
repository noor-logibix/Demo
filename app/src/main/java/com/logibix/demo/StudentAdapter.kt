package com.logibix.demo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.logibix.demo.databinding.ListItemBinding

class StudentAdapter(private val students: ArrayList<Student>) :
    RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val binding = ListItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return StudentViewHolder(binding)
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        holder.binding.tvName.text = students[position].name
        holder.binding.tvClass.text = students[position].standard
        holder.binding.tvRollNumber.text = students[position].rollNo.toString()
    }

    override fun getItemCount() = students.size

    class StudentViewHolder(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root)
}