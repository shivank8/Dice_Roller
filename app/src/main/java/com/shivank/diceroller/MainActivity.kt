package com.shivank.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

lateinit var btnRoll:Button
lateinit var imgDice:ImageView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnRoll=findViewById(R.id.btnRoll)
        imgDice=findViewById(R.id.imgDice)
        btnRoll.setOnClickListener{
            rollButton()
        }
    }

    private fun rollButton() {
        val imgResource= when(Random().nextInt(6)+1){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }
        imgDice.setImageResource(imgResource)
    }
}