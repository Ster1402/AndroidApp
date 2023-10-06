package com.sterdevs.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.sterdevs.diceroller.models.Dice

class MainActivity : AppCompatActivity() {

    private lateinit var rollButton : Button
    private lateinit var diceImage : ImageView
    private val dice = Dice()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rollButton = findViewById(R.id.rollButton)
        diceImage = findViewById(R.id.diceImage)

        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val imageId = dice.roll()
        diceImage.setImageResource( imageId )
        Toast
            .makeText(
                applicationContext,
                "Yeah 🔥!",
                Toast.LENGTH_SHORT)
            .show()
    }
}