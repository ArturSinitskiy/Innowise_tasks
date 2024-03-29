package com.hfad.usecases.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hfad.usecases.data.repository.DataRepositoryImplementation
import com.hfad.usecases.data.storage.sharedprefs.SharedPrefsDataStorage
import com.hfad.usecases.domain.models.SaveData
import com.hfad.usecases.domain.usecase.GetDataUseCase
import com.hfad.usecases.domain.usecase.SaveDataUseCase

class MainViewModel(
    private val getDataUseCase: GetDataUseCase,
    private val saveDataUseCase: SaveDataUseCase
) : ViewModel() {

    val resultLive = MutableLiveData<String>()

    fun save(text: String){
        if (text.isNotEmpty()) {
            val saveData = SaveData(text)
            saveDataUseCase.execute(saveData)
        }
    }

    fun load(){
        val data = getDataUseCase.execute()
        resultLive.value = data.dataEntries
    }

}