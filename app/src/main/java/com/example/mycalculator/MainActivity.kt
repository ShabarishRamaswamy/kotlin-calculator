package com.example.mycalculator

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var num = "";
    var num2 = "";
    var currentBtn = "1";
    fun onDigit(view: View){
        val button: Button = view as Button
        var id = button.id
        var tempNum = ""
        when(view.id){
            R.id.btn0 -> {
                tempNum += "0"
            }
            R.id.btn1 -> {
                tempNum += "1"
            }
            R.id.btn2 -> {
                tempNum += "2"
            }
            R.id.btn3 -> {
                tempNum += "3"
            }
            R.id.btn4 -> {
                tempNum += "4"
            }
            R.id.btn5 -> {
                tempNum += "5"
            }
            R.id.btn6 -> {
                tempNum += "6"
            }
            R.id.btn7 -> {
                tempNum += "7"
            }
            R.id.btn8 -> {
                tempNum += "8"
            }
            R.id.btn9 -> {
                tempNum += "9"
            }
        }
        var numText = findViewById<TextView>(R.id.tvInput)
        if(currentBtn == "2"){
            num2 += tempNum
//            Toast.makeText(this, num2, Toast.LENGTH_SHORT).show()
            numText.text = num2
        }else{
            num += tempNum
//            Toast.makeText(this, num, Toast.LENGTH_SHORT).show()
            numText.text = num
        }
    }

    fun onEquals(view: View){

    }

    fun onExpression(view: View){
        val button: Button = view as Button
        val id = button.id
        when(view.id){
            R.id.btnClear -> {
                num = ""
            }
            else -> {
                var inputText = findViewById<TextView>(R.id.tvInput)
                inputText.text = ""
                currentBtn = "2"
            }
        }
    }
}