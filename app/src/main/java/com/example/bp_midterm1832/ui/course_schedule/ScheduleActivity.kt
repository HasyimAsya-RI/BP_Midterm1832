package com.example.bp_midterm1832.ui.course_schedule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bp_midterm1832.R
import com.example.bp_midterm1832.ui.MainActivity
import com.example.bp_midterm1832.ui.course_schedule.day_2.Schedule2Activity
import com.example.bp_midterm1832.ui.course_schedule.day_3.Schedule3Activity
import com.example.bp_midterm1832.ui.course_schedule.day_4.Schedule4Activity
import com.example.bp_midterm1832.ui.course_schedule.day_5.Schedule5Activity

class ScheduleActivity : AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager?=null
    private var adapter:       RecyclerView.Adapter<ScheduleAdapter.ViewHolder>?=null

    override fun onCreate( savedInstanceState: Bundle? ) {
        super.onCreate( savedInstanceState )
        setContentView( R.layout.activity_schedule )

        // Recycler and Card View
        layoutManager               = LinearLayoutManager( this )
        var rvProduct: RecyclerView = findViewById( R.id.recyclerView_Schedule )
        rvProduct.layoutManager     = layoutManager

        adapter           = ScheduleAdapter()
        rvProduct.adapter = adapter

        // Back to Main
        val backtoMain: ImageView = findViewById( R.id.imageView_back )
        backtoMain.setOnClickListener {
            val intent = Intent( this, MainActivity::class.java )
            startActivity( intent )
        }


        // TEMPORARY: Course Schedule using Activity Function //
        val btnDay2: Button = findViewById( R.id.btn_tuesday )
        val btnDay3: Button = findViewById( R.id.btn_wednesday )
        val btnDay4: Button = findViewById( R.id.btn_thursday )
        val btnDay5: Button = findViewById( R.id.btn_friday )

        btnDay2.setOnClickListener {
            val intent = Intent( this, Schedule2Activity::class.java )
            startActivity( intent )
        }
        btnDay3.setOnClickListener {
            val intent = Intent( this, Schedule3Activity::class.java )
            startActivity( intent )
        }
        btnDay4.setOnClickListener {
            val intent = Intent( this, Schedule4Activity::class.java )
            startActivity( intent )
        }
        btnDay5.setOnClickListener {
            val intent = Intent( this, Schedule5Activity::class.java )
            startActivity( intent )
        }
    }

}