package com.example.dicerollerapp.model.domain

import kotlinx.coroutines.delay


class Dice {

    private val lessValueDice = 1
    private val lowValueDice = 6


   suspend fun getRandomDice() : Int {
       val diceGroup = (lessValueDice..lowValueDice)
       delay(1000)
       return diceGroup.random()

   }

}
