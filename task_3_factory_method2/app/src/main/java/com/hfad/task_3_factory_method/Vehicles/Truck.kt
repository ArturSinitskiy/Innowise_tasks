import com.hfad.task_3_factory_method.Orders.AutoOrder
import com.hfad.task_3_factory_method.Orders.Order
import com.hfad.task_3_factory_method.Vehicles.Transport


class Truck : Transport() {
    override val companyName: String = "AEROSTAR"
    override val maxLoadCapability: Int = 15
    override val maxCargoSize: Int = 15

    override fun deliverCargo(): Order {
        return AutoOrder()
    }

}