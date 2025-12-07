package com.example.horoscapp.feature.palmistry.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.horoscapp.R
import com.example.horoscapp.databinding.FragmentPalmistryBinding

class PalmistryFragment : Fragment() {

    private lateinit var _binding: FragmentPalmistryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPalmistryBinding.inflate(inflater, container, false)
        return _binding.root
    }

}