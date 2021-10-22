package com.example.dicerollerapp.model.repository

import com.example.dicerollerapp.model.domain.Dice
import kotlinx.coroutines.flow.flow

class DiceRepository {
    private val diceNumber = Dice()

    fun getRandomDice() = flow{
        emit(diceNumber.getRandomDice())
    }
}