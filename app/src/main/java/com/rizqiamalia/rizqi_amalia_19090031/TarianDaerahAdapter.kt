package com.rizqiamalia.rizqi_amalia_19090031

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TarianDaerahAdapter : RecyclerView.Adapter<TarianDaerahAdapter.Holder>() {

    private var judul = arrayOf(
        "Aceh",
        "Sumatra Utara",
        "Minangkabau"
    )
    private var deskripsi = arrayOf(
        "Tari Saman adalah tarian daerah yang berasal dari Daerah Istimewa Aceh yang populer di dalam negeri sekaligus di mata dunia.",
        "Tari Tor Tor adalah tarian daerah yang berasal dari Sumatra Utara, tepatnya daerah Danau Toba di Tapanuli. Tarian suku Batak ini biasanya dilakukan pada ritual-ritual tertentu, yakni pesta pernikahan, kematian, syukuran, sampai upacara penyembuhan orang sakit.",
        "Tari piring adalah tarian daerah yang berasal dari Minangkabau yang memiliki ciri khas dimana penari membawa piring saat menari."
    )
    private var gambar = intArrayOf(
        R.drawable.tarian_daerah_aceh,
        R.drawable.tarian_daerah_sumatra_utara,
        R.drawable.tarian_daerah_minangkabau
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