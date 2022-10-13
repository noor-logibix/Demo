package com.logibix.demo

import android.graphics.Color
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.logibix.demo.databinding.ListItemBinding

class SampleAdapter(val samples: ArrayList<Sample>) :
    RecyclerView.Adapter<SampleAdapter.StudentViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return StudentViewHolder(binding)
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        holder.binding.vCircle.setBackgroundColor(samples[position].colour)
        holder.binding.tvText.text = samples[position].text
        holder.binding.tvNumber.text = samples[position].number.toString()
    }

    override fun getItemCount() = samples.size

    class StudentViewHolder(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root)
}