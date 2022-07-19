package com.example.bp1832_midterm.ui.course_schedule

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.bp1832_midterm.R

class ScheduleAdapter: RecyclerView.Adapter<ScheduleAdapter.ViewHolder>() {

    //Deklarasi Data (Array)
    private var matakuliah  = arrayOf(
        "STATISTIKA",
        "JARINGAN KOMPUTER",
        "FINANCIAL TECHNOLOGY"
    )
    private var dosen       = arrayOf(
        "Dr. Kumara Ari Yuana, S.T., M.T.",
        "Niken Larasati, S.Kom., M.Eng.",
        "Ganjar Widiatmansyah, S.Kom., M.Eng."
    )
    private var waktu       = arrayOf(
        "07:30 - 08.30",
        "08:40 - 09:40",
        "15:30 - 16:30"
    )
    private var ruang       = arrayOf(
        "07.01.04",
        "07.01.04",
        "05.02.07"
    )

    inner class ViewHolder( itemView: View ): RecyclerView.ViewHolder( itemView ) {
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

    override fun onCreateViewHolder( parent: ViewGroup, viewType: Int ): ViewHolder {
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