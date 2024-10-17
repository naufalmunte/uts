package com.naufal.uts.adapter

// MakananAdapter.kt
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.naufal.uts.R
import com.naufal.uts.model.Makanan


class MakananAdapter(private val listMakanan: List<Makanan>) : RecyclerView.Adapter<MakananAdapter.MakananViewHolder>() {

    class MakananViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val namaMakanan: TextView = itemView.findViewById(R.id.tvNamaMakanan)
        val deskripsiMakanan: TextView = itemView.findViewById(R.id.tvDeskripsiMakanan)
        val hargaMakanan: TextView = itemView.findViewById(R.id.tvHargaMakanan)
        val gambarMakanan: ImageView = itemView.findViewById(R.id.ivGambarMakanan)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MakananViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_makanan, parent, false)
        return MakananViewHolder(view)
    }

    override fun onBindViewHolder(holder: MakananViewHolder, position: Int) {
        val makanan = listMakanan[position]
        holder.namaMakanan.text = makanan.nama
        holder.deskripsiMakanan.text = makanan.deskripsi
        holder.hargaMakanan.text = makanan.harga
        holder.gambarMakanan.setImageResource(makanan.gambar) // Set gambar dari drawable
    }

    override fun getItemCount(): Int {
        return listMakanan.size
    }
}
