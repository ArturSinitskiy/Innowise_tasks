package com.hfad.usecases.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.hfad.usecases.R
import com.hfad.usecases.databinding.ActivityMainBinding
import com.hfad.usecases.domain.models.Data
import com.hfad.usecases.domain.models.SaveData
import com.hfad.usecases.domain.usecase.GetDataUseCase
import com.hfad.usecases.domain.usecase.SaveDataUseCase

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val data = Data.getInstance()

    private val getDataUseCase = GetDataUseCase()
    private val saveDataUseCase = SaveDataUseCase()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGetData.setOnClickListener {
            val data = getDataUseCase.execute()
            binding.tvDataInfo.text = data.dataEntries
        }

        binding.btnSaveData.setOnClickListener {
            val saveData = SaveData(binding.etNewData.text.toString())
            saveDataUseCase.execute(saveData)
        }
    }
}