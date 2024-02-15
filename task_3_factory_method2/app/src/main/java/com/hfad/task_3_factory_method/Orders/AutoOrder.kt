package com.hfad.task_3_factory_method.Orders

import Truck
import com.hfad.task_3_factory_method.Vehicles.Plane
import com.hfad.task_3_factory_method.Vehicles.Transport


class AutoOrder: Order() {
    override val transport: Transport = Truck()

    override fun getFullInfo(): String {
        return super.getFullInfo() +
                "TRANSPORT INFO:\n" +
                "${transport.getInfo()}"
    }
}