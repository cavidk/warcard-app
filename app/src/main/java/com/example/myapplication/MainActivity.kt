package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    //This section is for initiating value
  lateinit var ivLeftCard: ImageView
  lateinit var ivRightCard: ImageView
  lateinit var tvScore: TextView
  lateinit var ivBtnClick: ImageView

    var rightCard = 0
    var leftCard = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            ivLeftCard = findViewById(R.id.iv_left_card)
            ivRightCard = findViewById(R.id.iv_right_card)
            ivBtnClick = findViewById(R.id.iv_click_dealbtn)
            tvScore = findViewById(R.id.tv_score)

            ivBtnClick.setOnClickListener {
               btnOnClick()
        }
    }

    @SuppressLint("SuspiciousIndentation")
    private fun btnOnClick(){

        leftCard = Random.nextInt(13) + 2
        rightCard = Random.nextInt(13) + 2

        var leftImage = resources.getIdentifier("card$leftCard", "drawable", packageName) //kotlin variant
            ivLeftCard.setImageResource(leftImage)

        var rightImage = resources.getIdentifier("card$rightCard", "drawable", packageName)
            ivRightCard.setImageResource(rightImage)

          var result = leftCard + rightCard
          tvScore.text = result.toString()

    }
}