package com.rizqiamalia.rizqi_amalia_19090031

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AlatMusikDaerahAdapter : RecyclerView.Adapter<AlatMusikDaerahAdapter.Holder>() {

    private var judul = arrayOf(
        "Gendhang",
        "Rebab",
        "Kecapi"
    )
    private var deskripsi = arrayOf(
        "Gendang juga merupakan salah satu alat musik yang digunakan pada pagelaran musik gamelan. Alat musik gendang dimainkan dengan cara dipukul atau diketuk pada bagian kulit yang ada di sisi kanan dan kiri alat musik.",
        "Alat musik tradisional yang berbentuk seperti busur panah ini bernama rebab. Rebab merupakan alat musik tradisional dari Jawa Barat. Kamu bisa memainkan alat musik rebab dengan digesek seperti biola.",
        "Kecapi sendiri merupakan alat musik tradisional yang berasal dari Sunda yang dimainkan sebagai alat musik utama dalam Tembang Sunda atau Mamaos Cianjuran dan Kacapi suling. Cara memainkan alat musik kecapi adalah dengan dipetik bagian senarnya."
    )
    private var gambar = intArrayOf(
        R.drawable.alat_musik_daerah_gendhang,
        R.drawable.alat_musik_daerah_rebab,
        R.drawable.alat_musik_daerah_kecapi
    )

    class Holder(view: View) : RecyclerView.ViewHolder(view) {
        var ivGambar: ImageView = view.findViewById(R.id.iv_gambar)
        var tvJudul: TextView = view.findViewById(R.id.tv_judul)
        var tvDeskripsi: TextView = view.findViewById(R.id.tv_deskripsi)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.adapter_pakaian_adat, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.tvJudul.text = judul[position]
        holder.tvDeskripsi.text = deskripsi[position]
        holder.ivGambar.setImageResource(gambar[position])
    }

    override fun getItemCount(): Int {
        return judul.size
    }
}