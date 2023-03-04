package com.provident.nestedrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val classes = listOf(
            SchoolClass(
                "Class 1",
                listOf(
                    Student("Raza", "razasaeed135@gmail.com", "03165994525"),
                    Student("Raza", "razasaeed135@gmail.com", "03165994525"),
                    Student("Raza", "razasaeed135@gmail.com", "03165994525")
                )
            ),
            SchoolClass(
                "Class 2",
                listOf(
                    Student("Raza", "razasaeed135@gmail.com", "03165994525"),
                    Student("Raza", "razasaeed135@gmail.com", "03165994525"),
                    Student("Raza", "razasaeed135@gmail.com", "03165994525"),
                    Student("Raza", "razasaeed135@gmail.com", "03165994525"),
                    Student("Raza", "razasaeed135@gmail.com", "03165994525")
                )
            ),
            SchoolClass(
                "Class 3",
                listOf(
                    Student("Raza", "razasaeed135@gmail.com", "03165994525"),
                    Student("Raza", "razasaeed135@gmail.com", "03165994525")
                )
            )
        )

        val nestedRecyclerView: RecyclerView = findViewById(R.id.nestedRecyclerView)
        nestedRecyclerView.layoutManager = LinearLayoutManager(this)
        nestedRecyclerView.adapter = ClassAdapter(classes)

    }
}