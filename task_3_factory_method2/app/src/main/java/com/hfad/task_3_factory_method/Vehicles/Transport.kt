package com.hfad.task_3_factory_method.Vehicles

import com.hfad.task_3_factory_method.Orders.Order

abstract class Transport {
    protected abstract val companyName: String
    protected abstract val maxLoadCapability: Int
    protected abstract val maxCargoSize: Int

    abstract fun deliverCargo(): Order

    open fun getInfo(): String {
        return "Company: $companyName\n" +
                "Max LC: $maxLoadCapability kg\n" +
                "Max cargo size: $maxCargoSize m\n"
    }
}