package com.example.dicerollerapp.view.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.dicerollerapp.R
import com.example.dicerollerapp.databinding.FragmentDiceBinding
import com.example.dicerollerapp.viewModels.DiceViewModel

@Suppress("UNREACHABLE_CODE")
class DiceFragment():Fragment(R.layout.fragment_dice) {

    lateinit var binding : FragmentDiceBinding
    private val diceViewModel : DiceViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_dice, container, false)
        binding.root
        return view
        binding .apply {
            viewModel = diceViewModel
            lifecycleOwner = this@DiceFragment
        }

    }




}


