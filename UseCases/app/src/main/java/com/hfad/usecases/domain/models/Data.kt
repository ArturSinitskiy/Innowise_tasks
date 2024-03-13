package com.hfad.usecases.domain.models

class Data private constructor() {

    var dataEntries: String? = null

    companion object{
        private var instance: Data? = null

        fun getInstance(): Data{
            if(instance == null){
                instance = Data()
            }
            return instance!!
        }
    }
}