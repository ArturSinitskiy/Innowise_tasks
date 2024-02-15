package com.hfad.task_3_factory_method.Orders

import com.hfad.task_3_factory_method.Deliveries.AirTransportKinds
import com.hfad.task_3_factory_method.Vehicles.Transport
import java.io.FileDescriptor
import java.io.Serializable
import java.util.concurrent.LinkedTransferQueue

abstract class Order {
    private var name: String = "Unknown cargo"
    private var description: String = "No info"
    private var destination: String = "No info"
    protected abstract val transport: Transport

    open fun getFullInfo(): String{
        return "Cargo: $name\n" +
           "Description: $description\n" +
           "Destination: $destination\n"
    }








    fun setName(name: String) {
        this.name = name
    }
    fun setDescription(description: String){
        this.description = description
    }
    fun setDestination(destination: String){
        this.destination = destination
    }
//    fun setTransport(transport: Transport){
//        this.transport = transport
//    }
//    fun setCargoKind(cargoKind: String){
//        this.cargoKind = cargoKind
//    }


//    class Builder {
//        private var name: String = ""
//        private var description: String = ""
//        private var destination: String = ""
//        private var transport: Transport = Truck()
//        private var cargoKind: String? = null
//
//        fun addName(name: String) = apply { this.name = name }
//        fun addDescription(description: String) = apply{ this.description = description}
//        fun addDestination(destination: String) = apply { this.destination = destination }
//        fun addCargoKind(cargoKind: String) = apply { this.cargoKind = cargoKind }
//        fun addTransport(transport: Transport) = apply { this.transport = transport }
//        fun build() = Order(name, description, destination, transport, cargoKind)
//    }

//    fun getFullInfo() = transport.getInfo() +
//            "Cargo name: $name\n" +
//            "Description: $description\n" +
//            "Destination: $destination\n" +
//            (if (cargoKind == null) cargoKind else "")
}