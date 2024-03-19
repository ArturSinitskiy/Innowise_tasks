package com.hfad.usecases.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.hfad.usecases.data.repository.DataRepositoryImplementation
import com.hfad.usecases.data.storage.sharedprefs.SharedPrefsDataStorage
import com.hfad.usecases.databinding.ActivityMainBinding

import com.hfad.usecases.domain.models.SaveData

import com.hfad.usecases.domain.usecase.GetDataUseCase
import com.hfad.usecases.domain.usecase.SaveDataUseCase

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val sharedPrefsDataStorage by lazy {
        SharedPrefsDataStorage(
            this
        )
    }
    private val dataRepository by lazy {
        DataRepositoryImplementation(
            sharedPrefsDataStorage
        )
    }
    private val getDataUseCase by lazy {
        GetDataUseCase(
            dataRepository
        )
    }
    private val saveDataUseCase by lazy {
        SaveDataUseCase(
            dataRepository
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGetData.setOnClickListener {
            val data = getDataUseCase.execute()
            binding.tvDataInfo.text = data.dataEntries
        }

        binding.btnSaveData.setOnClickListener {
            val saveData =
                SaveData(binding.etNewData.text.toString())
            if (saveData.dataEntries.isNotEmpty()) {
                saveDataUseCase.execute(saveData)
            }
        }
    }
}