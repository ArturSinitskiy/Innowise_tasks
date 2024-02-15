package com.hfad.task_3_factory_method.Vehicles

import com.hfad.task_3_factory_method.Orders.AirOrder
import com.hfad.task_3_factory_method.Deliveries.AirDeliveryTypes
import com.hfad.task_3_factory_method.Deliveries.AirTransportKinds
import com.hfad.task_3_factory_method.Orders.Order

class Plane : Transport() {

    override var companyName: String = "BELAVIA"
    override var maxLoadCapability: Int = 120000
    override var maxCargoSize: Int = 20

    private var type: AirDeliveryTypes = AirDeliveryTypes.INTERNATIONAL
    private var transportKind: AirTransportKinds = AirTransportKinds.CARGO

    fun setType(type: AirDeliveryTypes) {
        this.type = type
    }

    fun setTransportKind(transportKind: AirTransportKinds) {
        this.transportKind = transportKind
    }

    override fun deliverCargo(): Order {
        return AirOrder()
    }

    override fun getInfo(): String {
        return super.getInfo() +
                "Type: ${type.name}\n" +
                "Transport kind: ${transportKind.name}"
    }


}
