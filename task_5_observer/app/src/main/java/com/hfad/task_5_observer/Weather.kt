package com.hfad.task_5_observer

import java.sql.Time
import java.util.Date
import java.util.Timer
import java.util.TimerTask

class Weather private constructor() : Observed{

    private var observers = mutableListOf<Observer>()
    private var weather: Int = 0

    fun startShareWeather(){
        val timer = Timer()

        val timerTask = object : TimerTask(){

            override fun run() {
                weather = (10..35).random()

                notifyObservers()
            }
        }
        timer.schedule(timerTask, 0, 5000)
    }

    override fun addObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun deleteObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        for (observer in observers){
            observer.handleEvent(weather)
        }
    }

    companion object{
        private var instance: Weather? = null

        fun getInstance(): Weather{
            if(instance == null){
                instance = Weather()
            }
            return instance!!
        }
    }
    init {
        startShareWeather()
    }
}