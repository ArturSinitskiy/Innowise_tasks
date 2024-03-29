package com.hfad.usecases.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

import com.hfad.usecases.data.repository.DataRepositoryImplementation
import com.hfad.usecases.data.storage.sharedprefs.SharedPrefsDataStorage
import com.hfad.usecases.databinding.ActivityMainBinding

import com.hfad.usecases.domain.models.SaveData

import com.hfad.usecases.domain.usecase.GetDataUseCase
import com.hfad.usecases.domain.usecase.SaveDataUseCase
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val vm by viewModel<MainViewModel>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        vm.resultLive.observe(this) { text ->
            binding.tvDataInfo.text = text
        }

        binding.btnGetData.setOnClickListener {
            vm.load()
        }

        binding.btnSaveData.setOnClickListener {
            vm.save(binding.etNewData.text.toString())
        }
    }
}