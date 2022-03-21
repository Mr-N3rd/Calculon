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

    var lastNum: Boolean = true
    var lastOperator = false
    var lastDec: Boolean = false

    private fun isOperatorAdded(value: String) : Boolean{
        return if(value.startsWith("-")){
            false
        } else {
            value.contains("/") || value.contains("*")||value.contains("-")||value.contains("+")
        }
    }

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
        TVInput?.text?.let {
            if (lastNum && !isOperatorAdded(it.toString())) {
                TVInput?.append((view as Button).text)
                lastNum = false
                lastDec = false
            }
        }
    }

    fun clrPress(view: View) {
        TVInput?.text = ""
        lastDec = false
        lastOperator = false

    }

    fun totalPress(view: View) {
        var equation = TVInput
    }


}


