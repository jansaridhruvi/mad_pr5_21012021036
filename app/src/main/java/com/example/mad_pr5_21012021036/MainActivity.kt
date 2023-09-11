package com.example.mad_pr5_21012021036

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var bl : FloatingActionButton =findViewById(R.id.play)
        bl.setOnClickListener(){
          playpause()
        }
        var b2: FloatingActionButton =findViewById(R.id.stop)
        b2.setOnClickListener(){
            stop_m()
        }
    }
    fun playpause()
    {
        Intent(applicationContext,MyService::class.java).putExtra(MyService.PLAYERKEY,MyService.PLAYERKEY).apply { startService(this) }
    }
    fun stop_m()
    {
        Intent(applicationContext,MyService::class.java).putExtra(MyService.PLAYERKEY,MyService.PLAYERKEY).apply { stopService(this) }
    }
}