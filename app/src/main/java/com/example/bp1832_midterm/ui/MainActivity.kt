package com.example.bp1832_midterm.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.bp1832_midterm.R
import com.example.bp1832_midterm.ui.course_schedule.ScheduleActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate( savedInstanceState: Bundle? ) {
        getSupportActionBar()?.hide()
        super.onCreate( savedInstanceState )
        setContentView( R.layout.activity_main )

        val btnLogin: Button = findViewById( R.id.btn_login )
        btnLogin.setOnClickListener {
            val intent = Intent( this, ScheduleActivity::class.java )
            startActivity( intent )
        }
    }

}