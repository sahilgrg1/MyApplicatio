package com.example.counter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var count = 0 ;



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1.setOnClickListener {
            count = 0
            update(count)
        }
        btn2.setOnClickListener {
            count++
            update(count)
        }
        btn3.setOnClickListener {
            if(count ==0)
            {
                return@setOnClickListener
            }
            count--
            update(count)

        }

    }
    fun update(count:Int)
    {
        tv.setText(""+count)
    }
}
