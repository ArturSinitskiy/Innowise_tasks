package com.hfad.task_3_factory_method.Factories

import com.hfad.task_3_factory_method.Deliveries.Delivery
import com.hfad.task_3_factory_method.Deliveries.WaterDelivery
import com.hfad.task_3_factory_method.Deliveries.WaterDeliveryTypes

class WaterDeliveryFactory : DeliveryFactory {
    override fun createDelivery(): Delivery {
        return WaterDelivery()
    }
}