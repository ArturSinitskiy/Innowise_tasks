package com.hfad.task_1_coffee_builder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hfad.task_1_coffee_builder.databinding.ActivityMainBinding
import com.hfad.task_1_coffee_builder.databinding.ActivityResultCoffeeBinding

class ResultCoffeeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultCoffeeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultCoffeeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvInfo.text = intent.getStringExtra("result")
    }

    override fun onResume() {
        super.onResume()
        binding.apply {
            ivCupOfCoffee1.animate().rotation(360f).setDuration(1000).start()
            ivCupOfCoffee2.animate().rotation(360f).setDuration(1000).start()
            ivCupOfCoffee3.animate().rotation(360f).setDuration(1000).start()
        }
    }
}