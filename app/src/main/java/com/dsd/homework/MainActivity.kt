package com.dsd.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val hw14 = HW14()
        val textView: TextView = findViewById(R.id.textView)
        textView.text = hw14.doHomeWork1()


        val button: Button = findViewById(R.id.button)
        val textView5: TextView = findViewById(R.id.textView5)
        button.setOnClickListener { textView5.text = hw14.doHomeWork2() }

        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        val button4: Button = findViewById(R.id.button4)
        var numZag = zapolnitZagadku()
        button2.setOnClickListener { checkOtvet(numZag, button2.text as String)
            numZag = zapolnitZagadku()}
        button3.setOnClickListener { checkOtvet(numZag, button3.text as String)
            numZag = zapolnitZagadku()}
        button4.setOnClickListener { checkOtvet(numZag, button4.text as String)
            numZag = zapolnitZagadku()}

        val button5: Button = findViewById(R.id.button5)
        val plainTextView2: EditText = findViewById(R.id.editTextTextPersonName2)
        val textView10: TextView = findViewById(R.id.textView10)
        button5.setOnClickListener { textView10.text = hw14.doHomeWork4(plainTextView2.text.toString()) }
    }
    private fun zapolnitZagadku () : Int{
        val hw14 = HW14()
        val textView7: TextView = findViewById(R.id.textView7)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        val button4: Button = findViewById(R.id.button4)
        val i :Int = (0..2).random()
        textView7.text = hw14.zagadkaList[i].getZagadka()
        when ((1..6).random()){
            1-> {button2.text = hw14.zagadkaList[i].getOtvet()
                button3.text = hw14.zagadkaList[i].getNePrav1()
                button4.text = hw14.zagadkaList[i].getNePrav2()}
            2->{button2.text = hw14.zagadkaList[i].getOtvet()
                button4.text = hw14.zagadkaList[i].getNePrav1()
                button3.text = hw14.zagadkaList[i].getNePrav2()}
            3->{button3.text = hw14.zagadkaList[i].getOtvet()
                button2.text = hw14.zagadkaList[i].getNePrav1()
                button4.text = hw14.zagadkaList[i].getNePrav2()}
            4->{button3.text = hw14.zagadkaList[i].getOtvet()
                button4.text = hw14.zagadkaList[i].getNePrav1()
                button2.text = hw14.zagadkaList[i].getNePrav2()}
            5->{button4.text = hw14.zagadkaList[i].getOtvet()
                button2.text = hw14.zagadkaList[i].getNePrav1()
                button3.text = hw14.zagadkaList[i].getNePrav2()}
            else -> {button4.text = hw14.zagadkaList[i].getOtvet()
                button3.text = hw14.zagadkaList[i].getNePrav1()
                button2.text = hw14.zagadkaList[i].getNePrav2()}
        }
        return i
    }
    private fun checkOtvet (numZag:Int, chStr:String){
        val textView8: TextView = findViewById(R.id.textView8)
        val hw14 = HW14()
        if (chStr == hw14.zagadkaList[numZag].getOtvet()) textView8.text = "Правильно"
            else textView8.text = "Неправильно"


    }
}