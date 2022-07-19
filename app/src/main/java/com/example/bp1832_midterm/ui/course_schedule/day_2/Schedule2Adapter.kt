package com.example.bp1832_midterm.ui.course_schedule.day_2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.bp1832_midterm.R

class Schedule2Adapter: RecyclerView.Adapter<Schedule2Adapter.ViewHolder>() {

    //Deklarasi Data (Array)
    private var matakuliah  = arrayOf(
        "PERANCANGAN BASIS     DATA",
        "ANALISIS DAN PERANCANGAN SI",
        "FINANCIAL TECHNOLOGY"
    )
    private var dosen       = arrayOf(
        "Supriatin, M.Kom.",
        "Anggit Dwi Hartanto, M.Kom.",
        "Ganjar Widiatmansyah, S.Kom., M.Eng."
    )
    private var waktu       = arrayOf(
        "08:40 - 09.40",
        "09:50 - 10:50",
        "11:00 - 12:00"
    )
    private var ruang       = arrayOf(
        "05.03.03",
        "05.03.03",
        "02.04.02"
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