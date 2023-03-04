package com.provident.nestedrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ClassAdapter(private val classes: List<SchoolClass>) :
    RecyclerView.Adapter<ClassViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClassViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_class, parent, false)
        return ClassViewHolder(view)
    }

    override fun onBindViewHolder(holder: ClassViewHolder, position: Int) {
        val classes = classes[position]
        holder.class_name_textview.text = classes.name
        holder.student_recyclerview.layoutManager = LinearLayoutManager(holder.itemView.context)
        holder.student_recyclerview.adapter = StudentAdapter(classes.student)
    }

    override fun getItemCount(): Int {
        return classes.size
    }
}

class ClassViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val class_name_textview: TextView = itemView.findViewById(R.id.class_name_textview)
    val student_recyclerview: RecyclerView = itemView.findViewById(R.id.student_recyclerview)
}
