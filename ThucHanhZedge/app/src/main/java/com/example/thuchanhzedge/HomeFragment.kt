package com.example.thuchanhzedge

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.thuchanhzedge.adapter.Home1Adapter
import com.example.thuchanhzedge.adapter.Home2Adapter
import com.example.thuchanhzedge.adapter.Home3Adapter

class HomeFragment : Fragment() {
    private var layoutManager : RecyclerView.LayoutManager?= null
    private var layoutManager1 : RecyclerView.LayoutManager?= null
    private var layoutManager2 : RecyclerView.LayoutManager?= null
    private  var adapter1 : RecyclerView.Adapter<Home1Adapter.ViewHolder>?= null
    private  var adapter2 : RecyclerView.Adapter<Home2Adapter.ViewHolder>?= null
    private  var adapter3 : RecyclerView.Adapter<Home3Adapter.ViewHolder>?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        layoutManager = LinearLayoutManager(this.activity, LinearLayoutManager.HORIZONTAL, false)
        var recyclerView1 = view.findViewById<RecyclerView>(R.id.rcps)
        var recyclerView2 = view.findViewById<RecyclerView>(R.id.rcc)
        var recyclerView3 = view.findViewById<RecyclerView>(R.id.rcify)
        recyclerView1.layoutManager = layoutManager
        adapter1 = Home1Adapter()
        recyclerView1.adapter = adapter1

        layoutManager1 = LinearLayoutManager(this.activity, LinearLayoutManager.HORIZONTAL, false)
        recyclerView2.layoutManager = layoutManager1
        adapter2 = Home2Adapter()
        recyclerView2.adapter = adapter2

        layoutManager2 = GridLayoutManager(this.activity, 3)
        recyclerView3.layoutManager = layoutManager2
        adapter3 = Home3Adapter()
        recyclerView3.adapter = adapter3
  3 }

}