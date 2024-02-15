package com.hfad.task_3_factory_method.Factories

import com.hfad.task_3_factory_method.Deliveries.AutoDelivery
import com.hfad.task_3_factory_method.Deliveries.Delivery

interface DeliveryFactory {
    fun createDelivery(): Delivery
}