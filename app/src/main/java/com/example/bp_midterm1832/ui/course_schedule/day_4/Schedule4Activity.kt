package com.example.bp_midterm1832.ui.course_schedule.day_4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bp_midterm1832.R
import com.example.bp_midterm1832.ui.MainActivity
import com.example.bp_midterm1832.ui.course_schedule.ScheduleActivity
import com.example.bp_midterm1832.ui.course_schedule.day_2.Schedule2Activity
import com.example.bp_midterm1832.ui.course_schedule.day_3.Schedule3Activity
import com.example.bp_midterm1832.ui.course_schedule.day_5.Schedule5Activity

class Schedule4Activity : AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager?=null
    private var adapter:       RecyclerView.Adapter<Schedule4Adapter.ViewHolder>?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_schedule4)

        // Recycler and Card View
        layoutManager               = LinearLayoutManager( this )
        var rvProduct: RecyclerView = findViewById( R.id.recyclerView_Schedule )
        rvProduct.layoutManager     = layoutManager

        adapter           = Schedule4Adapter()
        rvProduct.adapter = adapter

        // Back to Main
        val backtoMain: ImageView = findViewById( R.id.imageView_back )
        backtoMain.setOnClickListener {
            val intent = Intent( this, MainActivity::class.java )
            startActivity( intent )
        }


        // TEMPORARY: Course Schedule using Activity Function //
        val btnDay1: Button = findViewById( R.id.btn_monday )
        val btnDay2: Button = findViewById( R.id.btn_tuesday )
        val btnDay3: Button = findViewById( R.id.btn_wednesday )
        val btnDay5: Button = findViewById( R.id.btn_friday )

        btnDay1.setOnClickListener {
            val intent = Intent( this, ScheduleActivity::class.java )
            startActivity( intent )
        }
        btnDay2.setOnClickListener {
            val intent = Intent( this, Schedule2Activity::class.java )
            startActivity( intent )
        }
        btnDay3.setOnClickListener {
            val intent = Intent( this, Schedule3Activity::class.java )
            startActivity( intent )
        }
        btnDay5.setOnClickListener {
            val intent = Intent( this, Schedule5Activity::class.java )
            startActivity( intent )
        }
    }

}