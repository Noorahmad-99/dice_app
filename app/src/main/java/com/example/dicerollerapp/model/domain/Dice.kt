package com.example.dicerollerapp.model.domain


class Dice {

    private val lessValueDice = 1
    private val lowValueDice = 6
    private val diceGroup = (lessValueDice..lowValueDice)

    fun getRandomDice() = diceGroup.random()

}
