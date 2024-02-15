package com.hfad.task_3_factory_method.Factories

import com.hfad.task_3_factory_method.Deliveries.AirDelivery
import com.hfad.task_3_factory_method.Deliveries.AirTransportKinds
import com.hfad.task_3_factory_method.Deliveries.Delivery

class AirDeliveryFactory : DeliveryFactory {
    override fun createDelivery(): Delivery {
        return AirDelivery()
    }
}