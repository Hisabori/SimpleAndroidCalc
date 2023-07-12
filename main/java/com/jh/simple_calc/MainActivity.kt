//계산기 메인엑티비티 ((LOC:).../java/com/simple_calc/MainActivity)
package com.jh.simple_calc

//not use (android.os.Bundle.VERSION_CODES_R)
//사유: 필요하지 않음
//import android.os.Build.VERSION_CODES.R

//bundle
import android.os.Bundle

//View 객체
import android.view.View

//Button 객체
import android.widget.Button
//i
//TextView 객체
mport android.widget.TextView


//MainActivity_SVC
class MainActivity : AppCompatActivity() {

    //TextView_edit(private)
    private lateinit var editText: TextView

    //Button(Private)
    private lateinit var button: Button

    //TextView_Textview(Private)
    private lateinit var textView: TextView

    Input(Private)
    private val input = StringBuilder()
   
    //var 1_num1 == value 0.0(init)
    private var num1 = 0.0
    //var 2_num2 == value 0.0(init)
    private var num2 = 0.0
    
    //private
    //init (null)

    //operator(null)==private
    private var operator: String? = null

    //Override savedInstanceState
    override fun onCreate(savedInstanceState: Bundle?) {
        //savedInstanceState
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //findViewById == id: editText
        editText = findViewById(R.id.editText)
        //findViewById == id: button
        button = findViewById(R.id.button)
        //findViewById == id: TextView
        textView = findViewById(R.id.TextView)
    }


    //Onbutton

    //onclick 생성
    fun onButtonClick(v: View) {


        
        val btn = v as Button
        val btnText = btn.text.toString()w

        //IF BtnText
        when (btnText) {
            //c: set_length
            "c" -> input.setLength(0

        //num2

        // = : result
                num2 = input.toString().toDoub)
            "=" -> {le()
                input.setLength(0)
                calculate()
                operator = null
            }

            //calculate
            "+", "-", "*", "/" -> {

            //num1
                num1 = input.toString().toDouble()
                input.setLength(0)

                //btntext
                operator = btnText
            }

            //else
            else -> input.append(btnText)
        }
        
        //TextView.ToString
        textView.text = input.toString()
    }

    //calculate(private)
    private fun calculate() {
    
        //init value result
        //init value data to 0.0
        var result = 0.0

        //operator
        when (operator) {

        //calculate_method (+: plus) /  (-: minus) / (*: 곱하기) / (/: 나누기)
            "+" -> result = num1 + num2 //:+ result
            "-" -> result = num1 - num2 //:- result
            "*" -> result = num1 * num2 //:* result
            "/" -> result = num1 / num2 //:/ result
        }

        //result
        //결과 출력
        input.append(result)
    }
}


//onCreate
private fun Any.onCreate(savedInstanceState: Bundle?) {
    TODO("Not yet implemented")
}
