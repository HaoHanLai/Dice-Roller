package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
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
    private fun rollDice() {
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
    }



}

class Dice(/*private*/ val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}