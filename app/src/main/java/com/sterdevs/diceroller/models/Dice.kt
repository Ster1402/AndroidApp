package com.sterdevs.diceroller.models

import com.sterdevs.diceroller.R

class Dice {
    var currentFaceID : Int = 0

    fun roll() {
        currentFaceID = pickRandomImageID()
    }

    private fun pickRandomImageID() : Int {
        val dicesImagesID = intArrayOf(
            R.drawable.dice_1,
            R.drawable.dice_2,
            R.drawable.dice_3,
            R.drawable.dice_4,
            R.drawable.dice_5,
            R.drawable.dice_6,
        )

        return dicesImagesID.random()
    }
}