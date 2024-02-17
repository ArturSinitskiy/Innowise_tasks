package com.hfad.task_5_observer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hfad.task_5_observer.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity(), Observer {

    private lateinit var binding: ActivityThirdBinding
    private val weather = Weather.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvWeather.text = intent.getStringExtra("currentWeather")

        weather.addObserver(this)

        binding.btnPreviousPage.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
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