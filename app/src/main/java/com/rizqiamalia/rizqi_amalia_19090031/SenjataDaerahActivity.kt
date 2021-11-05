package com.rizqiamalia.rizqi_amalia_19090031

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_pakaian_adat.*
import kotlinx.android.synthetic.main.activity_senjata_daerah.*

class SenjataDaerahActivity : AppCompatActivity() {

    private lateinit var adapter: SenjataDaerahAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_senjata_daerah)

        setData()
    }

    fun setData() {
        val layoutManager = LinearLayoutManager(applicationContext)
        layoutManager.orientation = LinearLayoutManager.VERTICAL

        adapter = SenjataDaerahAdapter()

        rv_senjata_daerah.layoutManager = layoutManager
        rv_senjata_daerah.adapter = adapter
    }

}