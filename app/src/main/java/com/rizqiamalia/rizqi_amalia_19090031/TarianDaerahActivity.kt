package com.rizqiamalia.rizqi_amalia_19090031

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_pakaian_adat.*
import kotlinx.android.synthetic.main.activity_tarian_daerah.*

class TarianDaerahActivity : AppCompatActivity() {

    private lateinit var adapter: TarianDaerahAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tarian_daerah)

        setData()
    }

    fun setData() {
        val layoutManager = LinearLayoutManager(applicationContext)
        layoutManager.orientation = LinearLayoutManager.VERTICAL

        adapter = TarianDaerahAdapter()

        rv_tarian_daerah.layoutManager = layoutManager
        rv_tarian_daerah.adapter = adapter
    }

}