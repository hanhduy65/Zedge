package com.example.thuchanhzedge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*
var frag: Boolean = false
class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var imgexit: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adaptervv = ViewPager(supportFragmentManager, lifecycle)
        pager.adapter = adaptervv
        TabLayoutMediator(tab, pager) { tab, pos ->
            when (pos) {
                0 -> {
                    tab.text = getString(R.string.fragment0)
                }
                1 -> {
                    tab.text = getString(R.string.fragment1)
                }
            }
        }.attach()
    }

    override fun onResume() {
        super.onResume()
        if (frag == false) {
            setContentView(R.layout.activity_popup)
            imgexit = findViewById(R.id.imgexit)
            imgexit.setOnClickListener(this)
            frag = true
        }
    }

    override fun onClick(p0: View?) {
        var intent = Intent(this, MainActivity::class.java)
        startActivity(intent)

    }
}