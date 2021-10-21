package com.example.dicerollerapp.model.repository

import com.example.dicerollerapp.model.domain.Dice

class DiceRepository {
    private val diceNumber = Dice()

    fun getRandomDice() = diceNumber.getRandomDice()
}