package com.hfad.task_3_factory_method.Orders

import com.hfad.task_3_factory_method.Vehicles.Plane
import com.hfad.task_3_factory_method.Vehicles.Ship
import com.hfad.task_3_factory_method.Vehicles.Transport

class WaterOrder : Order() {
    override val transport: Transport = Ship()

    override fun getFullInfo(): String {
        return super.getFullInfo() +
                "TRANSPORT INFO:" +
                "\n${transport.getInfo()}"
    }

}