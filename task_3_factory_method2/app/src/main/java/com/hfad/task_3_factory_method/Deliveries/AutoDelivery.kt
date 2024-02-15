package com.hfad.task_3_factory_method.Deliveries

import Truck
import android.util.Log
import com.hfad.task_3_factory_method.Vehicles.Transport


class AutoDelivery : Delivery {
    override fun provideTransport(): Transport {
        return Truck()
    }
}