package com.rizqiamalia.rizqi_amalia_19090031

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PakaianAdatAdapter : RecyclerView.Adapter<PakaianAdatAdapter.Holder>() {

    private var judul = arrayOf(
        "Bali",
        "Jawa Tengah",
        "Papua"
    )
    private var deskripsi = arrayOf(
        "Pakaian adat Bali merupakan cerminan kebudayaan yang berkembang di Provinsi Bali. Terdapat empat jenis pakaian adat Bali dengan unsur berbeda bagi laki-laki dan perempuan.",
        "Jawi Jingkep adalah pakaian adat resmi yang dikenakan pria Jawa Tengah. Pakaian ini terdiri dari atasan berupa baju Beskap yang biasanya dilengkapi dengan motif bunga. Bawahannya adalah kain jarik yang cara penggunaannya dengan dililitkan di pinggang.",
        "Ini adalah salah satu pakaian adat Papua yang paling dikenal. Namun koteka juga memiliki sebutan kedaerahan lain yaitu hilon, harim, atau bobbe. Koteka adalah pakaian tradisional untuk laki-laki yang cukup nyentrik karena ia memiliki fungsi untuk menutupi bagian kemaluan pria."
    )
    private var gambar = intArrayOf(
        R.drawable.pakaian_adat_bali,
        R.drawable.pakaian_adat_jawa_tengah,
        R.drawable.pakaian_adat_papua
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