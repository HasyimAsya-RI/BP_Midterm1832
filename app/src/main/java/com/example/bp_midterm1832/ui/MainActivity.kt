package com.example.bp_midterm1832.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.bp_midterm1832.R
import com.example.bp_midterm1832.ui.course_schedule.ScheduleActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate( savedInstanceState: Bundle? ) {
        super.onCreate( savedInstanceState )
        setContentView( R.layout.activity_main )

        val btnLogin: Button = findViewById( R.id.btn_login )
        btnLogin.setOnClickListener {
            val intent = Intent( this, ScheduleActivity::class.java )
            startActivity( intent )
        }
    }

}