package com.hfad.task_3_factory_method.Orders

import com.hfad.task_3_factory_method.Orders.Order
import com.hfad.task_3_factory_method.Vehicles.Plane
import com.hfad.task_3_factory_method.Vehicles.Transport


class AirOrder: Order() {

    private var cargoType: String = "Passengers"
    override val transport: Transport = Plane()

    override fun getFullInfo(): String {
       return super.getFullInfo() +
               "Cargo type: $cargoType" +
               "TRANSPORT INFO:\n" +
               "${transport.getInfo()}"
    }
}