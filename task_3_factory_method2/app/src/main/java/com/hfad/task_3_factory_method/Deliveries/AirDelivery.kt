package com.hfad.task_3_factory_method.Deliveries


import com.hfad.task_3_factory_method.Vehicles.Plane
import com.hfad.task_3_factory_method.Vehicles.Transport

class AirDelivery : Delivery {
    override fun provideTransport(): Transport {
        return Plane()
    }
}