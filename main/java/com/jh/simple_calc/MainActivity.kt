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

    private lateinit var editText: EditText
    private lateinit var button: Button
    private lateinit var textView: TextView
    private val input = StringBuilder()
    private var num1: Double = 0.0
    private var num2: Double = 0.0
    private var operator: String? = null

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

        when (operator) {
            "+" -> result = num1 + num2
            "-" -> result = num1 - num2
            "*" -> result = num1 * num2
            "/" -> result = num1 / num2
        }

        input.append(result)
    }
}
