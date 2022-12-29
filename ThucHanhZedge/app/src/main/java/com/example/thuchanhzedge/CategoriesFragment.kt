package com.example.thuchanhzedge

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.thuchanhzedge.adapter.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [CategoriesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CategoriesFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var layoutManager : RecyclerView.LayoutManager?= null
    private var layoutManager1 : RecyclerView.LayoutManager?= null
    private var layoutManager2 : RecyclerView.LayoutManager?= null
    private var layoutManager3 : RecyclerView.LayoutManager?= null
    private  var adapter4 : RecyclerView.Adapter<Cate4Adapter.ViewHolder>?= null
    private  var adapter1 : RecyclerView.Adapter<Cate1Adapter.ViewHolder>?= null
    private  var adapter2 : RecyclerView.Adapter<Cate2Adapter.ViewHolder>?= null
    private  var adapter3 : RecyclerView.Adapter<Cate3Adapter.ViewHolder>?= null


    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_categories, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment CategoriesFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            CategoriesFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        layoutManager = LinearLayoutManager(this.activity, LinearLayoutManager.HORIZONTAL, false)
        var recyclerView1 = view.findViewById<RecyclerView>(R.id.rcps)
        var recyclerView2 = view.findViewById<RecyclerView>(R.id.rcc)
        var recyclerView3 = view.findViewById<RecyclerView>(R.id.rcify)
        var recyclerView4 = view.findViewById<RecyclerView>(R.id.rccate)
        recyclerView1.layoutManager = layoutManager
        adapter1 = Cate1Adapter()
        recyclerView1.adapter = adapter1

        layoutManager1 = LinearLayoutManager(this.activity, LinearLayoutManager.HORIZONTAL, false)
        recyclerView2.layoutManager = layoutManager1
        adapter2 = Cate2Adapter()
        recyclerView2.adapter = adapter2

        layoutManager2 = LinearLayoutManager(this.activity, LinearLayoutManager.VERTICAL, false)
        recyclerView3.layoutManager = layoutManager2
        adapter3 = Cate3Adapter()
        recyclerView3.adapter = adapter3

        layoutManager3 = GridLayoutManager(this.activity, 2)
        recyclerView4.layoutManager = layoutManager3
        adapter4 = Cate4Adapter()
        recyclerView4.adapter = adapter4
    }
}