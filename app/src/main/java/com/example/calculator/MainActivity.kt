package com.example.calculator

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

private var TVInput: TextView? = null

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        TVInput = findViewById(R.id.textView)
    }

    private var lastNum: Boolean = false
    private var lastDec: Boolean = false


    fun numPress(view: View) {
        TVInput?.append((view as Button).text)
        lastNum = true
        lastDec = false
    }

    fun dotPress(view: View) {
        if (lastNum && !lastDec) { // Indicates that a decimal was pressed -- If decimal press check is not true
            TVInput?.append((view as Button).text) // Takes the button Text as a text view and appends the contents
            lastDec =
                true // sets the decimal counter state to true until a operator or equals is pressed
            lastNum = false
        }
    }

    fun clrPress(view: View) {
        TVInput?.text = ""
        lastDec = false
        lastNum = false

    }

    private fun isOperatorAdded(value: String): Boolean { // adds an operator, first checks if minus as minus can be used for negative integers.
        return if (value.startsWith("-")) {
            //returns the value if the value starts with -.
            false
        } else {
            value.contains("/")
                    || value.contains("*")
                    || value.contains("-")
                    || value.contains("+")
        }
    }

    fun operPress(view: View) {
        TVInput?.text?.let {
            // using let, will tell you what the context for it is in this block

            if (lastNum && !isOperatorAdded(it.toString())) { // Checks whether or not there is a prior operator.
                TVInput?.append((view as Button).text)
                lastNum = false
                lastDec = false
            }
        }
    }


    fun totalPress(view: View) {
        if (lastNum) {
            var tvValue = TVInput?.text.toString()
            var prefix = ""

            try {
                //Allows for negative Numbers
                if (tvValue.startsWith("-")) {
                    prefix = "-"
                    tvValue = tvValue.substring(1)
                }
                // splits the calculation into a pair of strings delimiting for -
                // handles mathematical equations for subtraction
                if (tvValue.contains("-")) {

                    val splitVal = tvValue.split("-")
                    var one = splitVal[0]
                    var two = splitVal[1]

                    // Handles the mathematics of negative numbers.
                    if (prefix.isNotEmpty()) {
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


