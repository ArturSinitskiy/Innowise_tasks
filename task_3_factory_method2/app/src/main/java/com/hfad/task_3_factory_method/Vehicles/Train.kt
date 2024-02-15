import com.hfad.task_3_factory_method.Deliveries.RailwayArrangement
import com.hfad.task_3_factory_method.Orders.Order
import com.hfad.task_3_factory_method.Orders.RailwayOrder
import com.hfad.task_3_factory_method.Vehicles.Transport


class Train : Transport() {
    override val companyName: String = "BELARUSIAN RAILWAY"
    override val maxLoadCapability: Int = 900000
    override val maxCargoSize: Int = 10

    private val trackSize = 1520
    private val pathsArrangement = RailwayArrangement.WITH_BALLAST

    override fun deliverCargo(): Order {
        return RailwayOrder()

    }

    override fun getInfo(): String {
        return super.getInfo() +
                "TrackSize: $trackSize\n" +
                "Paths arrangement: ${pathsArrangement.name}\n"
    }
}