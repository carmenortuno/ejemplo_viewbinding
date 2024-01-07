package com.example.ejemplo_viewbinding.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ejemplo_viewbinding.R
import com.example.ejemplo_viewbinding.databinding.ActivityMainBinding
import com.example.ejemplo_viewbinding.databinding.FragmentBindingBinding


class FragmentBinding : Fragment() {

    private var _binding: FragmentBindingBinding? =null
    //Esta propiedad es válida entre onCreateView y onDestroyView.
    private val binding get() = _binding!! //Es el getter para acceder al valor
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBindingBinding.inflate(inflater,container, false)
        // Inflate the layout for this fragment
        val view = binding.root
        return view
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textof.text="SOY UN FRAGMENT"

    }


}