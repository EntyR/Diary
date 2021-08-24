package com.example.calendar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calendar.databinding.ActivityMainBinding
import com.example.calendar.ui.fragments.CreateEventFragment

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.floatingActionButton.setOnClickListener {
            val dialog = CreateEventFragment()
            dialog.show(supportFragmentManager, "create")
        }
    }

}