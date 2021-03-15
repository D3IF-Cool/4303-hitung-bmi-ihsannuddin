package org.d3if0043.hitungbmi.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.d3if0043.hitungbmi.databinding.FragmentHitungBinding

class HitungFragment : Fragment() {
    private lateinit var binding: FragmentHitungBinding override fun onCreateView
            (inflater: LayoutInflater, container: ViewGroup?,
             savedInstanceState: Bundle?): View?
    {
        binding = FragmentHitungBinding.inflate(
                layoutInflater, container, false)
        binding.button.setOnClickListener { hitungBmi()}
        return binding.root
    }

}