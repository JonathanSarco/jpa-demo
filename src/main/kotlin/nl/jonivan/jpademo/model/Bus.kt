package nl.jonivan.jpademo.model

import nl.jonivan.jpademo.enum.VehicleType
import java.util.*

data class Bus(
    override val id: UUID,
    override val brand: String,
    override val isBus: Boolean,
    override val vehicleType: VehicleType = VehicleType.BUS
): Vehicle(
    id = id,
    brand = brand,
    isBus = isBus,
    vehicleType = vehicleType
)