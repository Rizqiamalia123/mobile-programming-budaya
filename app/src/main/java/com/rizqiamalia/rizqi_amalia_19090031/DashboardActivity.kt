package com.rizqiamalia.rizqi_amalia_19090031

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        setMenu()
    }

    fun setMenu() {
        cv_pakaian_adat.setOnClickListener {
            startActivity(Intent(this, PakaianAdatActivity::class.java))
        }
        cv_rumah_adat.setOnClickListener {
            startActivity(Intent(this, RumahAdatActivity::class.java))
        }
        cv_tarian_daerah.setOnClickListener {
            startActivity(Intent(this, TarianDaerahActivity::class.java))
        }
        cv_senjata_daerah.setOnClickListener {
            startActivity(Intent(this, SenjataDaerahActivity::class.java))
        }
        cv_alat_musik_daerah.setOnClickListener {
            startActivity(Intent(this, AlatMusikDaerahActivity::class.java))
        }
        cv_makanan_daerah.setOnClickListener {
            startActivity(Intent(this, MakananDaerahActivity::class.java))
        }
    }
}