package nl.jonivan.jpademo.model

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import nl.jonivan.jpademo.enum.VehicleType
import java.util.*

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "vehicleType",
    visible = true
)
@JsonSubTypes(
    JsonSubTypes.Type(value = Car::class, name = "CAR"),
    JsonSubTypes.Type(value = Bus::class, name = "BUS"),
)
abstract class Vehicle(
    open val id: UUID,
    open val brand: String,
    open val isCar: Boolean = false,
    open val isBus: Boolean = false,
    open val vehicleType: VehicleType
) {
}