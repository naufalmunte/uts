package com.naufal.uts

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.naufal.uts.adapter.MakananAdapter
import com.naufal.uts.model.Makanan


class makanan : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_makanan)

        val makananList = listOf(
            Makanan("Kue 1", "10 Nov, 06:06 pm", "Rp 20.000", R.drawable.img1),
            Makanan("Kue 2", "01 Des, 20.30 pm","Rp 25.000", R.drawable.img2)
        )

        // Setup RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MakananAdapter(makananList)
    }
}
