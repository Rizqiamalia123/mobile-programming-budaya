package com.rizqiamalia.rizqi_amalia_19090031

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_alat_musik_daerah.*
import kotlinx.android.synthetic.main.activity_pakaian_adat.*

class AlatMusikDaerahActivity : AppCompatActivity() {

    private lateinit var adapter: AlatMusikDaerahAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alat_musik_daerah)

        setData()
    }

    fun setData() {
        val layoutManager = LinearLayoutManager(applicationContext)
        layoutManager.orientation = LinearLayoutManager.VERTICAL

        adapter = AlatMusikDaerahAdapter()

        rv_alat_musik_daerah.layoutManager = layoutManager
        rv_alat_musik_daerah.adapter = adapter
    }

}