package com.rizqiamalia.rizqi_amalia_19090031

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_pakaian_adat.*
import kotlinx.android.synthetic.main.activity_rumah_adat.*

class RumahAdatActivity : AppCompatActivity() {

    private lateinit var adapter: RumahAdatAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rumah_adat)

        setData()
    }

    fun setData() {
        val layoutManager = LinearLayoutManager(applicationContext)
        layoutManager.orientation = LinearLayoutManager.VERTICAL

        adapter = RumahAdatAdapter()

        rv_rumah_adat.layoutManager = layoutManager
        rv_rumah_adat.adapter = adapter
    }
}