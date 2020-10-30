package com.example.tugasrecycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list.view.*

class Adapter (private val list:ArrayList<Data>) : RecyclerView.Adapter<Adapter.Holder>(){
    class Holder (val view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(LayoutInflater.from(parent.context).inflate(R.layout.list,parent,false))
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.view.namamakanan.text = list.get(position).namamkn
        holder.view.harga.text = list.get(position).harga
        holder.view.gambar.setImageBitmap(list.get(position).gambarmkn)
        holder.view.setOnClickListener {
            Toast.makeText(holder.view.context, "Tersedia " + list.get(position).namamkn, Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int = list.size
}