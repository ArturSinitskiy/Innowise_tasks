package com.hfad.task_3_factory_method.Orders

import Train
import com.hfad.task_3_factory_method.Vehicles.Plane

import com.hfad.task_3_factory_method.Vehicles.Transport

class RailwayOrder: Order() {
    override val transport: Transport = Train()

    override fun getFullInfo(): String {
        return super.getFullInfo() +
                "TRANSPORT INFO:\n" +
                "${transport.getInfo()}"
    }
}