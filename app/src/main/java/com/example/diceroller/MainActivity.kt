package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
        }

        // Do a dice roll when the app starts
        rollDice()
    }

    //original code
    /**
     * Roll the dice and update the screen with the result.
     */
    /*    private fun rollDice() {
        // Create new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()

        // Update the screen with the dice roll
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }*/

    //setup code
    /*private fun rollDice() {
        val myFirstDice = Dice(6)
        val diceRoll = myFirstDice.roll()
        println("Your ${myFirstDice.numSides} sided dice rolled ${diceRoll}!")
    }
}*/

    //Check if the lucky number has been rolled (First method)
    /*private fun rollDice() {
        val myFirstDice = Dice(6)
        val rollResult = myFirstDice.roll()
        val luckyNumber = 4

        if (rollResult == luckyNumber) {
            println("You win!")
        } else if (rollResult == 1) {
            println("So sorry! You rolled a 1. Try again!")
        } else if (rollResult == 2) {
            println("Sadly, you rolled a 2. Try again!")
        } else if (rollResult == 3) {
            println("Unfortunately, you rolled a 3. Try again!")
        } else if (rollResult == 4) {
            println("No luck! You rolled a 4. Try again!")
        } else if (rollResult == 5) {
            println("Don't cry! You rolled a 5. Try again!")
        } else {
            println("Apologies! you rolled a 6. Try again!")
        }
    }*/

    //Check if the lucky number has been rolled (Second method)
    /*private fun rollDice() {
        val myFirstDice = Dice(6)
        val rollResult = myFirstDice.roll()
        val luckyNumber = 4

        when (rollResult){
            luckyNumber -> println("You win!")
            1 -> println("So sorry! You rolled a 1. Try again!")
            2 -> println("Sadly, you rolled a 2. Try again!")
            3 -> println("Unfortunately, you rolled a 3. Try again!")
            4 -> println("No luck! You rolled a 4. Try again!")
            5 -> println("Don't cry! You rolled a 5. Try again!")
            6 -> println("Apologies! you rolled a 6. Try again!")
        }
    }*/

    //Change the dice image when the button is clicked
    /*private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()

        // Update the TextView with the dice roll
        *//*val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = dice.roll().toString()*//*
        val diceImage: ImageView = findViewById(R.id.imageView)
        diceImage.setImageResource(R.drawable.dice_2)
    }*/

    //Update the rollDice() method
    /*private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()

        val diceImage: ImageView = findViewById(R.id.imageView)

        when (diceRoll) {
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        }
    }*/

    /**
     * Roll the dice and update the screen with the result.
     */
    //Optimize your code
    private fun rollDice() {
        // Create new Dice object with 6 sides and roll the dice
        val dice = Dice(6)
        val diceRoll = dice.roll()

        // Find the ImageView in the layout
        val diceImage: ImageView = findViewById(R.id.imageView)

        // Determine which drawable resource ID to use based on the dice roll
        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        // Update the ImageView with the correct drawable resource ID
        diceImage.setImageResource(drawableResource)

        // Update the content description
        diceImage.contentDescription = diceRoll.toString()
    }
}

class Dice(/*private*/ val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}