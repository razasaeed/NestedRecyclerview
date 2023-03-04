package com.provident.nestedrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.widget.TextView

class StudentAdapter(private val students: List<Student>) :
    RecyclerView.Adapter<StudentViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_student, parent, false)
        return StudentViewHolder(view)
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        val studentItem = students[position]
        holder.student_name_textview.text = studentItem.name
        holder.student_email_textview.text = studentItem.email
        holder.student_contact_textview.text = studentItem.contact

    }

    override fun getItemCount(): Int {
        return students.size
    }


}

class StudentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val student_name_textview: TextView = itemView.findViewById(R.id.student_name_textview)
    val student_email_textview: TextView = itemView.findViewById(R.id.student_email_textview)
    val student_contact_textview: TextView = itemView.findViewById(R.id.student_contact_textview)
}
