package com.example.livedata

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.livedata.R.layout.activity_main

class MainActivity : ComponentActivity() {
    lateinit var txtView: TextView
    lateinit var btn : Button
    private val viewModel : ViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)

        viewModel.counter.observe(this, Observer { count -> txtView.text = count.toString() })

        btn.setOnClickListener {
            viewModel.increment()
        }


    }
}