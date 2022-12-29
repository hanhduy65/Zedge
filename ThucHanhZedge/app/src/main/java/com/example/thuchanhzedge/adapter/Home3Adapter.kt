package com.example.thuchanhzedge.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.thuchanhzedge.R

class Home3Adapter : RecyclerView.Adapter<Home3Adapter.ViewHolder>(){

    var image = intArrayOf(R.drawable.christmas, R.drawable.merry_christmas, R.drawable.happy_new_year, R.drawable.c5, R.drawable.slap_an_idiot, R.drawable.stitch, R.drawable.shiny_roses, R.drawable.img)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.itemhome3, parent, false)
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
            itemimage = view.findViewById(R.id.imgp)
        }
    }
}