package com.example.jirkova_kotlin

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    //Объявление переменных
    private var text: String = "<Педро Паскаль> <и Дария> крутыши"
    private var tvText: TextView? = null; //Создали переменную для TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //отображение нужного слова
        tvText = findViewById(R.id.tvTextView2) //Связали переменную и компонент
        var subText: String = text.substringAfter('<')
        var subText2: String = subText.substringBefore('>')
        var subText3: String = text.substringAfter('<')
        var subText4: String = subText.substringBefore('>')
        //Отобразить содержимое пременной tvText на компонент tvTextView2
        tvText?.setText(subText)
        tvText?.setText(subText2)
        tvText?.setText(subText3)
        tvText?.setText(subText4)
    }

//Еаписать любое предложение и заключить два слова в треул скобки, разместить еще один  TextView на активити и отобразить эти два слова в TextView
}