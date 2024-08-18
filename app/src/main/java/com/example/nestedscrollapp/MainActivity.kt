package com.example.nestedscrollapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView1 = findViewById<RecyclerView>(R.id.recyclerView1)
        val recyclerView2 = findViewById<RecyclerView>(R.id.recyclerView2)
        val itemList = listOf(
            ItemModel(R.drawable.img1, "Text 1"),
            ItemModel(R.drawable.img2, "Text 2"),
            ItemModel(R.drawable.img3, "Text 3"),
            ItemModel(R.drawable.fur1, "Text 4"),
            ItemModel(R.drawable.fur2, "Text 5"),
            ItemModel(R.drawable.fur3, "Text 6"),
        )

        val adapter = ItemAdapter(itemList)

        recyclerView1.adapter = adapter
        recyclerView1.layoutManager = LinearLayoutManager(this)

        recyclerView2.adapter = adapter
        recyclerView2.layoutManager = LinearLayoutManager(this)
    }
}
