package com.rizqiamalia.rizqi_amalia_19090031

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_pakaian_adat.*

class PakaianAdatActivity : AppCompatActivity() {

    private lateinit var adapter: PakaianAdatAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pakaian_adat)

        setData()
    }

    fun setData() {
        val layoutManager = LinearLayoutManager(applicationContext)
        layoutManager.orientation = LinearLayoutManager.VERTICAL

        adapter = PakaianAdatAdapter()

        rv_pakaian_adat.layoutManager = layoutManager
        rv_pakaian_adat.adapter = adapter
    }

}