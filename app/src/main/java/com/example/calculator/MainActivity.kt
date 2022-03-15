package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
private lateinit var TVInput: TextView
private var calcButton: Button?=null
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    fun numPress (view: View) {
        Toast.makeText(this, "Button Pressed.", Toast.LENGTH_SHORT).show()

    }
}
