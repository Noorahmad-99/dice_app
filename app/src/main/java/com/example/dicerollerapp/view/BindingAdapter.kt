package com.example.dicerollerapp.view

import android.view.View
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import com.example.dicerollerapp.R
import com.example.dicerollerapp.model.domain.Numbers



@BindingAdapter(value = ["diceImage"])
fun diceImage(view :View , value: Numbers?){
        when(value) {

            Numbers.ONE -> view.background = ContextCompat.getDrawable(view.context ,
                R.drawable.dice_1
            )
            Numbers.TWO -> view.background = ContextCompat.getDrawable(view.context ,
                R.drawable.dice_2
            )
            Numbers.THREE -> view.background = ContextCompat.getDrawable(view.context ,
                R.drawable.dice_3
            )
            Numbers.FOUR -> view.background = ContextCompat.getDrawable(view.context ,
                R.drawable.dice_4
            )
            Numbers.FIVE -> view.background = ContextCompat.getDrawable(view.context ,
                R.drawable.dice_5
            )
            Numbers.SIXE -> view.background = ContextCompat.getDrawable(view.context ,
                R.drawable.dice_6e
            )
                  null -> view.background = ContextCompat.getDrawable(view.context ,
                      R.drawable.dice_0
                  )

        }

}