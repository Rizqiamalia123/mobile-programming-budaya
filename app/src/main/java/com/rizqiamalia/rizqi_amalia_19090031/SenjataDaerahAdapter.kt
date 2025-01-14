package com.rizqiamalia.rizqi_amalia_19090031

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SenjataDaerahAdapter : RecyclerView.Adapter<SenjataDaerahAdapter.Holder>() {

    private var judul = arrayOf(
        "Aceh",
        "Sumatra Barat",
        "Maluku",
    )
    private var deskripsi = arrayOf(
        "Rencong Aceh. Rencong memiliki bentuk yang mirip pisau dengan gagang khas. Mata rencong sedikit melengkung dengan gagang menyerupai huruf “L”. Ukuran badan rencong berkisar 10-50 cm.",
        "Senjata kurambiak berasal dari Sumatera Barat. Bentuk kurambiak ini cukup unik karena memiliki bentuk seperti kuku macan dan berukuran kecil.",
        "Parang salawaku. Parang berarti pisau besar, sedangkan salawaki berarti tameng. Jadi, parang salawaki adalah senjata khas yang digunakan sebagai tameng untuk melindungi diri dari senjata lawan."
    )
    private var gambar = intArrayOf(
        R.drawable.senjata_daerah_aceh,
        R.drawable.senjata_daerah_sumatra_barat,
        R.drawable.senjata_daerah_maluku
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