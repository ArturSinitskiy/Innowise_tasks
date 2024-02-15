package com.hfad.task_3_factory_method.Deliveries

import Train
import android.util.Log

import com.hfad.task_3_factory_method.Vehicles.Transport


class RailwayDelivery: Delivery {
    override fun provideTransport(): Transport {
        return Train()
    }
}