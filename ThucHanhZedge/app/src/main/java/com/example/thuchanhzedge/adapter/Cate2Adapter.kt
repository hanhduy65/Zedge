package com.example.thuchanhzedge.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.thuchanhzedge.R

class Cate2Adapter : RecyclerView.Adapter<Cate2Adapter.ViewHolder>(){

    var image = intArrayOf(R.drawable.c4,R.drawable.c5,R.drawable.c6,R.drawable.c7, R.drawable.c8, R.drawable.merry_christmas, R.drawable.merry_christmas)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.itemcate2, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemimage.setImageResource(image[position])
    }

    override fun getItemCount(): Int {
        return image.size
    }

    inner class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        var itemimage : ImageView

        init {
            itemimage = view.findViewById(R.id.imgc)

        }
    }
}