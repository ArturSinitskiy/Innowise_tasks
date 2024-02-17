package com.hfad.task_5_observer

interface Observed {
    fun addObserver(observer: Observer)
    fun deleteObserver(observer: Observer)
    fun notifyObservers()
}