package com.hfad.task_3_factory_method.Deliveries

import android.util.Log
import com.hfad.task_3_factory_method.Vehicles.Ship
import com.hfad.task_3_factory_method.Vehicles.Transport


class WaterDelivery: Delivery {
    override fun provideTransport(): Transport {
        return Ship()
    }
}