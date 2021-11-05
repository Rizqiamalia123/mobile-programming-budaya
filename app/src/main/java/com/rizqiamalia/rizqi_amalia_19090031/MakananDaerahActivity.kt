package com.rizqiamalia.rizqi_amalia_19090031

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_makanan_daerah.*
import kotlinx.android.synthetic.main.activity_pakaian_adat.*

class MakananDaerahActivity : AppCompatActivity() {

    private lateinit var adapter: MakananDaerahAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_makanan_daerah)

        setData()
    }

    fun setData() {
        val layoutManager = LinearLayoutManager(applicationContext)
        layoutManager.orientation = LinearLayoutManager.VERTICAL

        adapter = MakananDaerahAdapter()

        rv_makanan_daerah.layoutManager = layoutManager
        rv_makanan_daerah.adapter = adapter
    }

}