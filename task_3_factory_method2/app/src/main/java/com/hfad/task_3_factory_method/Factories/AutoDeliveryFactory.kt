package com.hfad.task_3_factory_method.Factories

import com.hfad.task_3_factory_method.Deliveries.AutoDelivery
import com.hfad.task_3_factory_method.Deliveries.Delivery


class AutoDeliveryFactory : DeliveryFactory {

    override fun createDelivery(): Delivery {
        return AutoDelivery()
    }
}