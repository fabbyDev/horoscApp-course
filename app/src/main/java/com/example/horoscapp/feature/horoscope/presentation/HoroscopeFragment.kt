package com.example.horoscapp.feature.horoscope.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.horoscapp.databinding.FragmentHoroscopeBinding


class HoroscopeFragment : Fragment() {

    private lateinit var _binding: FragmentHoroscopeBinding
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHoroscopeBinding.inflate(inflater, container, false)
        return _binding.root
    }

}