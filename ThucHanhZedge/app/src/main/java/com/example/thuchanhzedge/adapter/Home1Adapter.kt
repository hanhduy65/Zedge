package com.example.thuchanhzedge.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.thuchanhzedge.R

class Home1Adapter : RecyclerView.Adapter<Home1Adapter.ViewHolder>(){

    var name = arrayOf("NFTs", "Trending", "Recent", "Animals")
    var image = intArrayOf(R.drawable.merry_christmas, R.drawable.christmas, R.drawable.stitch, R.drawable.shiny_roses)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.itemhome1, parent, false)
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
            itemimage = view.findViewById(R.id.imgps)
            itemname = view.findViewById(R.id.tvps)
        }
    }
}