package com.hfad.task_3_factory_method.Vehicles

import com.hfad.task_3_factory_method.Deliveries.WaterDeliveryTypes
import com.hfad.task_3_factory_method.Orders.Order
import com.hfad.task_3_factory_method.Orders.WaterOrder

class Ship : Transport() {
    override val companyName: String = "IRISL Group"
    override val maxLoadCapability: Int = 1000000
    override val maxCargoSize: Int = 200

    private val type: WaterDeliveryTypes = WaterDeliveryTypes.SEA

    override fun deliverCargo(): Order {
        return WaterOrder()
    }

    override fun getInfo(): String {
        return super.getInfo() +
                "Type: ${type.name}\n"
    }
}