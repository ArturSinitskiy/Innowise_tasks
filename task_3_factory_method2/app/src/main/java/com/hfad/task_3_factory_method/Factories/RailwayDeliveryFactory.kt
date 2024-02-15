package com.hfad.task_3_factory_method.Factories

import com.hfad.task_3_factory_method.Deliveries.Delivery
import com.hfad.task_3_factory_method.Deliveries.RailwayArrangement
import com.hfad.task_3_factory_method.Deliveries.RailwayDelivery

class RailwayDeliveryFactory : DeliveryFactory {
    override fun createDelivery(): Delivery {
        return RailwayDelivery()
    }
}