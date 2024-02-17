package com.hfad.task_5_observer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hfad.task_5_observer.databinding.ActivityFirstBinding
import com.hfad.task_5_observer.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity(), Observer {

    private lateinit var binding: ActivitySecondBinding
    private val weather = Weather.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvWeather.text = intent.getStringExtra("currentWeather")

        weather.addObserver(this)

        binding.btnPreviousPage.setOnClickListener {
            val intent = Intent(this, FirstActivity::class.java)
            intent.putExtra("currentWeather", binding.tvWeather.text.toString())
            startActivity(intent)
        }
        binding.btnNextPage.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("currentWeather", binding.tvWeather.text.toString())
            startActivity(intent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        weather.deleteObserver(this)
    }

    override fun handleEvent(newWeather: Int) {
        runOnUiThread {
            binding.tvWeather.text = "$newWeather °C"
        }
    }
}