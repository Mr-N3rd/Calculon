package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

private var TVInput: TextView? = null

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        TVInput = findViewById(R.id.textView)


    }

    val lastNum: Boolean = true
    var lastOperator = false
    var lastDec: Boolean = false



    fun numPress(view: View) {
        TVInput?.append((view as Button).text)
    }

    fun dotPress(view: View) {
        if (!lastDec) {
            TVInput?.append((view as Button).text)
            lastDec = true
        } else {
            Toast.makeText(this, "LastDec Pressed", Toast.LENGTH_SHORT).show()
        }
    }

    fun operPress(view: View) {
        if () {
            TVInput?.append((view as Button).text)
            lastDec = false
            lastOperator = true
        } else {
            Toast.makeText(this, "Operator already exists", Toast.LENGTH_SHORT).show()
        }
    }

    fun clrPress(view: View) {
        TVInput?.text = ""
        lastDec = false
        lastOperator = false

    }

    fun divPress(view: View) {
        if (!lastOperator) {
            TVInput?.append((view as Button).text)
        }
    }

    fun totalPress(view: View) {
        var equation = TVInput
    }
//
//    fun btn1Press(view: View) {
//        val btn1: Button = findViewById(R.id.btn1)
//        Toast.makeText(this, "Button Pressed.", Toast.LENGTH_SHORT).show()
//        TVInput?.append(btn1.toString())
//    }
//
//    fun btn2Press(view: View) {
//        val btn1: Button = findViewById(R.id.btn1)
//        Toast.makeText(this, "Button Pressed.", Toast.LENGTH_SHORT).show()
//        TVInput?.append(btn1.toString())
//    }
//
//    fun btn3Press(view: View) {
//        val btn1: Button = findViewById(R.id.btn1)
//        Toast.makeText(this, "Button Pressed.", Toast.LENGTH_SHORT).show()
//        TVInput?.append(btn1.toString())
//    }
//
//    fun btn4Press(view: View) {
//        val btn1: Button = findViewById(R.id.btn1)
//        Toast.makeText(this, "Button Pressed.", Toast.LENGTH_SHORT).show()
//        TVInput?.append(btn1.toString())
//    }
//
//    fun btn5Press(view: View) {
//        val btn1: Button = findViewById(R.id.btn1)
//        Toast.makeText(this, "Button Pressed.", Toast.LENGTH_SHORT).show()
//        TVInput?.append(btn1.toString())
//    }
//
//    fun btn6Press(view: View) {
//        val btn1: Button = findViewById(R.id.btn1)
//        Toast.makeText(this, "Button Pressed.", Toast.LENGTH_SHORT).show()
//        TVInput?.append(btn1.toString())
//    }
//
//    fun btn7Press(view: View) {
//        val btn1: Button = findViewById(R.id.btn1)
//        Toast.makeText(this, "Button Pressed.", Toast.LENGTH_SHORT).show()
//        TVInput?.append(btn1.toString())
//    }

}


