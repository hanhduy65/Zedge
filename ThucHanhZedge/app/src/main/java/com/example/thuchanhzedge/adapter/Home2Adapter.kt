package com.example.thuchanhzedge.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.thuchanhzedge.R

class Home2Adapter : RecyclerView.Adapter<Home2Adapter.ViewHolder>(){

    var name = arrayOf("DARK Abstracts", "Colorful Space", "Fluid Abstract", "Hello Winter", "Cat cute")
    var desc = arrayOf("abstracts,abstrac...kgound..", "space, planet, surreal", "abstract, acrylic, fluid", "winter, december, new-...", "wallpaper, entertainment")
    var image = intArrayOf(R.drawable.purple_snowflake, R.drawable.slap_an_idiot, R.drawable.sparkling_heart, R.drawable.sun_and_moon, R.drawable.merry_christmas)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.itemhome2, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemname.text = name[position]
        holder.itemdesc.text = desc[position]
        holder.itemimage.setImageResource(image[position])
    }

    override fun getItemCount(): Int {
        return name.size
    }

    inner class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        var itemimage : ImageView
        var itemname : TextView
        var itemdesc : TextView

        init {
            itemimage = view.findViewById(R.id.imgps)
            itemname = view.findViewById(R.id.tvps)
            itemdesc = view.findViewById(R.id.tvpc2)
        }
    }
}