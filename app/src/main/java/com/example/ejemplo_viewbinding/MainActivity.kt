package com.example.ejemplo_viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.ejemplo_viewbinding.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.texto.text="Hola"
        binding.button.setOnClickListener {
            binding.texto.text=binding.edit.text.toString()
        }

    }
}