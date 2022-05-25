package com.example.bp_midterm1832.ui.course_schedule.day_4

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.bp_midterm1832.R

class Schedule4Adapter: RecyclerView.Adapter<Schedule4Adapter.ViewHolder>() {

    //Deklarasi Data (Array)
    private var matakuliah  = arrayOf(
        ""
    )
    private var dosen       = arrayOf(
        ""
    )
    private var waktu       = arrayOf(
        ""
    )
    private var ruang       = arrayOf(
        ""
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