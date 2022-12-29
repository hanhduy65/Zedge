package com.example.thuchanhzedge.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.thuchanhzedge.R

class Cate3Adapter : RecyclerView.Adapter<Cate3Adapter.ViewHolder>(){

    var name = arrayOf("Eminem", "50 cent", "Snoop dogg")
    var image = intArrayOf(R.drawable.c9, R.drawable.c1, R.drawable.c6)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.itemcate3, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemname.text = name[position]
        holder.itemimage.setImageResource(image[position])
    }

    override fun getItemCount(): Int {
        return name.size
    }

    inner class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        var itemimage : ImageView
        var itemname : TextView

        init {
            itemimage = view.findViewById(R.id.imgidfy)
            itemname = view.findViewById(R.id.tvidfy)
        }
    }
}