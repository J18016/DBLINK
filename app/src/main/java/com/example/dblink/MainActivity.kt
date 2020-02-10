package com.example.dblink

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.example.dblink.MyAsynctask
import com.example.dblink.R

class MainActivity : AppCompatActivity() {

    var b1:Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        b1 = findViewById(R.id.button) as Button
        b1!!.setOnClickListener{
            val post = MyAsynctask("Android",10.11)
            post.execute()
        }
    }
}
