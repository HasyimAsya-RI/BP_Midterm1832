package com.example.bp_midterm1832.ui.course_schedule.day_5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.bp_midterm1832.R

class Schedule5Adapter: RecyclerView.Adapter<Schedule5Adapter.ViewHolder>() {

    //Deklarasi Data (Array)
    private var matakuliah  = arrayOf(
        "JARINGAN KOMPUTER",
        "PERANCANGAN BASIS     DATA",
        "BAHASA PEMROGRAMAN    II",
        "STATISTIKA"
    )
    private var dosen       = arrayOf(
        "Niken Larasati, S.Kom., M.Eng.",
        "Supriatin, M.Kom.",
        "Stevi Ema Wijayanti, M.Kom.",
        "Dr. Kumara Ari Yuana, S.T., M.T."
    )
    private var waktu       = arrayOf(
        "07:30 - 08:30",
        "08:40 - 09.40",
        "09:50 - 10:50",
        "13:00 - 14:00"
    )
    private var ruang       = arrayOf(
        "07.05.01",
        "07.04.01",
        "02.04.01",
        "07.03.01"
    )

    inner class ViewHolder( itemView: View): RecyclerView.ViewHolder( itemView ) {
        //Instance Palette Card View
        var itemMatakuliah: TextView
        var itemDosen: TextView
        var itemWaktu: TextView
        var itemRuang: TextView

        init {
            itemMatakuliah = itemView.findViewById( R.id.item_matakuliah )
            itemDosen      = itemView.findViewById( R.id.item_dosen )
            itemWaktu      = itemView.findViewById( R.id.item_waktu )
            itemRuang      = itemView.findViewById( R.id.item_ruang )
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int ): ViewHolder {
        val view = LayoutInflater.from( parent.context ).
        inflate( R.layout.cardview_schedule, parent, false )
        return ViewHolder( view )
    }

    override fun onBindViewHolder( holder: ViewHolder, position: Int ) {
        holder.itemMatakuliah.text = matakuliah[position]
        holder.itemDosen.text      = dosen[position]
        holder.itemWaktu.text      = waktu[position]
        holder.itemRuang.text      = ruang[position]
    }

    override fun getItemCount(): Int {
        return matakuliah.size
    }
}