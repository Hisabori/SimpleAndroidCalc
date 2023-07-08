package com.jh.simple_calc


import android.os.Build.VERSION_CODES.R
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var editText: TextView
    private lateinit var button: Button
    private lateinit var textView: TextView
    private val input = StringBuilder()
    private var num1 = 0.0
    private var num2 = 0.0
    private var operator: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.editText)
        button = findViewById(R.id.button)
        textView = findViewById(R.id.TextView)
    }


    fun onButtonClick(v: View) {
        val btn = v as Button
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

private fun Any.onCreate(savedInstanceState: Bundle?) {
    TODO("Not yet implemented")
}
