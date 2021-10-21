package com.example.dicerollerapp.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.dicerollerapp.model.domain.Numbers
import com.example.dicerollerapp.model.repository.DiceRepository

class DiceViewModel : ViewModel() {

    private val repository = DiceRepository()

    private val _numberDice = MutableLiveData<Int>()
    val numberDice: LiveData<Int>
        get() = _numberDice

    private val _imageDice = MutableLiveData<Numbers>()
    val imageDice: LiveData<Numbers>
        get() = _imageDice


    fun getDice(){
         _numberDice.postValue(repository.getRandomDice())
        _imageDice.postValue(Numbers.values().random())
    }
}