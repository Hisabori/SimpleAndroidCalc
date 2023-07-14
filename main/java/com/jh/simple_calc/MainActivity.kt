package com.jh.simple_calc

import android.annotation.SuppressLint
import android.os.Build.VERSION_CODES.R
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    //var (private)
    private lateinit var editText: EditText //EditText
    private lateinit var button: Button //Button
    private lateinit var textView: TextView //TextView
    private val input = StringBuilder() //StringBuilder
    private var num1: Double = 0.0 //value init (reset) - num1
    private var num2: Double = 0.0 //value init (reset) - num2
    private var operator: String? = null //null value (초기화)

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.editText)
        button = findViewById(R.id.button)
        textView = findViewById(R.id.textView)

        button.setOnClickListener {
            val btn = it as Button
            val btnText = btn.text.toString()

            when (btnText) {
                "c" -> input.setLength(0)
                "=" -> {
                    num2 = input.toString().toDouble()
                    input.setLength(0)
                    calculate()
                    operator = null
                }
                "+", "-", "*", "/" -> {
                    num1 = input.toString().toDouble()
                    input.setLength(0)
                    operator = btnText
                }
                else -> input.append(btnText)
            }

            textView.text = input.toString()
        }
    }

    private fun setContentView(activityMain: Any) {
        TODO("Not yet implemented")
    }

    private fun calculate() {
        var result = 0.0

        //operator
        when (operator) {
            "+" -> result = num1 + num2 //plus
            "-" -> result = num1 - num2 //minus
            "*" -> result = num1 * num2 // (x)
            "/" -> result = num1 / num2 // (/)
        }

        input.append(result)
    }
}
