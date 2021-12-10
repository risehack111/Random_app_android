package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.R
import android.annotation.SuppressLint
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @SuppressLint("SetTextI18n")
    fun onMyClick(view: View?) {
        val min = findViewById<EditText>(R.id.min)
        val max = findViewById<EditText>(R.id.max)
        if (min.text.toString() == "") {
            min.setText("0")
            return
        }
        if (max.text.toString() == "") {
            max.setText("1000")
            return
        }
        val tv = findViewById<TextView>(R.id.textView)
        val ppp = min.text.toString().toInt()
        val pppp = max.text.toString().toInt()
        val qqq = (Math.random() * (pppp - ppp) + ppp).toInt()
        tv.text = Integer.toString(qqq)
    }
}