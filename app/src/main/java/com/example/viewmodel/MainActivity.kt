package com.example.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val upButton = findViewById<Button>(R.id.upBtn)
        val downButton = findViewById<Button>(R.id.downBtn)
        val numText = findViewById<TextView>(R.id.numText)


        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        setNum(numText)


        upButton.setOnClickListener {
            viewModel.up()
            setNum(numText)
        }

        downButton.setOnClickListener {
            viewModel.down()
            setNum(numText)
        }


    }

    private fun setNum(numText : TextView)
    {
        numText.text = viewModel.num.toString()
    }
}