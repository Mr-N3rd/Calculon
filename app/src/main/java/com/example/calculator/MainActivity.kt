package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
import java.lang.ArithmeticException

private var TVInput: TextView? = null

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        TVInput = findViewById(R.id.textView)
    }

    private var lastNum: Boolean = true

    //    private var lastOperator = false
    private var lastDec: Boolean = false

    private fun isOperatorAdded(value: String): Boolean {
        return if (value.startsWith("-")) {
            false
        } else {
            value.contains("/") || value.contains("*") || value.contains("-") || value.contains("+")
        }
    }

    fun numPress(view: View) {
        TVInput?.append((view as Button).text)
        lastNum = true
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
//        lastOperator = false

    }

    fun totalPress(view: View) {

        if (lastNum) {
            var tvValue = TVInput?.text.toString()
            var prefix = ""

            try {

                //Allows for negative Numbers
                if(tvValue.startsWith("-")){
                    prefix="-"
                    tvValue = tvValue.substring(1)
                }
                // splits the calculation into a pair of strings delimiting for -
                // handles mathematical equations for subtraction
                if (tvValue.contains("-")){

                    val splitVal = tvValue.split("-")
                    var one = splitVal[0]
                    var two = splitVal[1]

                    // Handles the mathematics of negative numbers.
                    if (prefix.isNotEmpty()){
                        one = prefix + one
                    }

                    TVInput?.text = (one.toDouble() - two.toDouble()).toString()
                }
            } catch (e: ArithmeticException) {
                e.printStackTrace()
            }



        }

    }


}


