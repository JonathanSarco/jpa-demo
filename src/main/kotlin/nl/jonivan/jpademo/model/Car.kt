package nl.jonivan.jpademo.model

import nl.jonivan.jpademo.enum.VehicleType
import java.util.*

class Car(
    override val id: UUID,
    override val brand: String,
    override val isCar: Boolean,
    override val vehicleType: VehicleType = VehicleType.CAR
): Vehicle(
    id = id,
    brand = brand,
    isCar = isCar,
    vehicleType = vehicleType
)