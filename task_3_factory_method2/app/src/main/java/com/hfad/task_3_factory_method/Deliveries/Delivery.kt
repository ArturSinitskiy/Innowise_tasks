package com.hfad.task_3_factory_method.Deliveries

import com.hfad.task_3_factory_method.Vehicles.Transport

interface Delivery {
   fun provideTransport() : Transport
}