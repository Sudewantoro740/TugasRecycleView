package com.example.tugasrecycleview

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val listmkn = ArrayList<Data>()
    val daftarmkn = arrayOf(
        "Nasi Goreng",
        "Nasi Bebek",
        "Nasi Pecel",
        "Mie Goreng",
        "Mie Kuah",
        "Mie Ayam",
        "Bakso",
        "Ayam Goreng"
    )
    val daftarharga = arrayOf(
        "Rp. 12.000",
        "Rp. 15.000",
        "Rp. 10.000",
        "Rp. 12.000",
        "Rp. 12.000",
        "Rp. 12.000",
        "Rp. 10.000",
        "Rp. 15.000"
    )
    val gambarmkn = intArrayOf(R.drawable.nasigoreng, R.drawable.nasibebek, R.drawable.nasipecel,
        R.drawable.miegoreng, R.drawable.miekuah, R.drawable.mieayam, R.drawable.bakso,
        R.drawable.ayamgoreng)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView =  findViewById<RecyclerView>(R.id.mRecyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        for (i in 0 until daftarmkn.size) {
            listmkn.add(Data(daftarmkn.get(i), daftarharga.get(i), BitmapFactory.decodeResource(resources, gambarmkn[i])))
            if (daftarmkn.size - 1 == i){
                val adapter = Adapter(listmkn)
                adapter.notifyDataSetChanged()
                recyclerView.adapter = adapter

            }
        }
    }
}