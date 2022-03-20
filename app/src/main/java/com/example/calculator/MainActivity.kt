package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

private var TVInput: TextView? = null

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        TVInput = findViewById(R.id.textView)


    }

    fun numPress(view: View) {}

    fun btn1Press(view: View) {
        val btn1: Button = findViewById(R.id.btn1)
        Toast.makeText(this, "Button Pressed.", Toast.LENGTH_SHORT).show()
        TVInput?.append(btn1.toString())
    }

    fun btn2Press(view: View) {
        val btn1: Button = findViewById(R.id.btn1)
        Toast.makeText(this, "Button Pressed.", Toast.LENGTH_SHORT).show()
        TVInput?.append(btn1.toString())
    }

    fun btn3Press(view: View) {
        val btn1: Button = findViewById(R.id.btn1)
        Toast.makeText(this, "Button Pressed.", Toast.LENGTH_SHORT).show()
        TVInput?.append(btn1.toString())
    }

    fun btn4Press(view: View) {
        val btn1: Button = findViewById(R.id.btn1)
        Toast.makeText(this, "Button Pressed.", Toast.LENGTH_SHORT).show()
        TVInput?.append(btn1.toString())
    }

    fun btn5Press(view: View) {
        val btn1: Button = findViewById(R.id.btn1)
        Toast.makeText(this, "Button Pressed.", Toast.LENGTH_SHORT).show()
        TVInput?.append(btn1.toString())
    }

    fun btn6Press(view: View) {
        val btn1: Button = findViewById(R.id.btn1)
        Toast.makeText(this, "Button Pressed.", Toast.LENGTH_SHORT).show()
        TVInput?.append(btn1.toString())
    }

    fun btn7Press(view: View) {
        val btn1: Button = findViewById(R.id.btn1)
        Toast.makeText(this, "Button Pressed.", Toast.LENGTH_SHORT).show()
        TVInput?.append(btn1.toString())
    }

}
