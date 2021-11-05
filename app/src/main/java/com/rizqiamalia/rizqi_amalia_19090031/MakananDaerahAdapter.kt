package com.rizqiamalia.rizqi_amalia_19090031

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MakananDaerahAdapter : RecyclerView.Adapter<MakananDaerahAdapter.Holder>() {

    private var judul = arrayOf(
        "Aceh",
        "Medan",
        "Jambi"
    )
    private var deskripsi = arrayOf(
        "Keumamah dalam bahasa Aceh artinya ikan kayu. Masakan ini disebut Gulaie Keumamah atau nama populernya Eungkot Kayee.  Pada dasarnya Keumamah atau ikan kayu khas Aceh adalah daing ikan tongkol yang direbus, kemudian dikeringkan dengan cara diasap. Karena ikan tersebut menjadi kering maka akan keras seperti kayu (eungkot kayee).",
        "Di Medan terdapat sebuah kedai sederhana namun punya olahan bernama bihun bebek Asie yang disebut-sebut sebagai olahan bihun bebek paling mahal seantero Medan. Harga satu porsinya saja bisa mencapai 60 ribu rupiah. Dalam satu mangkuk berisi bihun dan suwiran daging bebek yang melimpah bercampur kuahnya yang super enak.",
        "Gulai ikan Patin adalah masakan yang populer di masyarakat Jambi.  Gulai ini dimasak dengan menggunakan tempoyak yaitu daging buah durian yang telah difermentasi. Tetapi ada sebagian orang yang memilih untuk mengganti tempoyak dengan santan kelapa untuk menghindari bau dan rasa tempoyak yang cukup menyengat.",
        "Deskripsi 4",
        "Deskripsi 5"
    )
    private var gambar = intArrayOf(
        R.drawable.makanan_daerah_aceh,
        R.drawable.makanan_daerah_medan,
        R.drawable.makanan_daerah_jambi
    )

    class Holder(view: View) : RecyclerView.ViewHolder(view) {
        var ivGambar: ImageView = view.findViewById(R.id.iv_gambar)
        var tvJudul: TextView = view.findViewById(R.id.tv_judul)
        var tvDeskripsi: TextView = view.findViewById(R.id.tv_deskripsi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.adapter_makanan_daerah, parent, false)
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