package com.rizqiamalia.rizqi_amalia_19090031

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RumahAdatAdapter : RecyclerView.Adapter<RumahAdatAdapter.Holder>() {

    private var judul = arrayOf(
        "Sumatra Utara",
        "Riau",
        "Bengkulu"
    )
    private var deskripsi = arrayOf(
        "Pada rumah adat Bolon ini, terdapat dua bagian yang berbeda, yaitu Jabu Bolon dan juga Jabu Parsakitan. Jabu Bolon biasa menjadi tempat untuk keluarga besar, sedangkan Jabu Parsakitan adalah tempat untuk membicarakan masalah adat. Uniknya dari rumah adat Sumatera Utara ini adalah tidak ada sekatan antara tiap ruangan, sehingga semua anggota keluarga tidur bersama.",
        "Rumah Adat Selaso Jatuh Kembar. Nama dari rumah ini memiliki arti yaitu rumah dengan dua selasar. Masyarakat Riau bukan menjadikan Rumah Selaso Jatuh Kembar sebagai tempat tinggal mereka, namun hanya menggunakannya untuk acara adat saja.",
        "Rumah Bubungan Lima. Rumah adat dari Bengkulu ini memiliki tiang penopang dan menggunakan kayu khusus untuk membuatnya, yaitu kayu Medang Kemuning. Untuk memasuki rumah ini juga harus menggunakan tangga yang berada pada bagian depan rumah.",
    )
    private var gambar = intArrayOf(
        R.drawable.rumah_adat_sumatra_utara,
        R.drawable.rumah_adat_riau,
        R.drawable.rumah_adat_bengkulu
    )

    class Holder(view: View) : RecyclerView.ViewHolder(view) {
        var ivGambar: ImageView = view.findViewById(R.id.iv_gambar)
        var tvJudul: TextView = view.findViewById(R.id.tv_judul)
        var tvDeskripsi: TextView = view.findViewById(R.id.tv_deskripsi)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.adapter_rumah_adat, parent, false)
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