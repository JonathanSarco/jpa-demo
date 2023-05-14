package nl.jonivan.jpademo.entity

import jakarta.persistence.Column
import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity
import nl.jonivan.jpademo.entity.Car.Companion.TYPE
import java.util.*

@Entity
@DiscriminatorValue(TYPE)
data class Car(
    override var id: UUID,
    override var brand: String,
    @Column(name = "is_car")
    val isCar: Boolean
): Vehicle(
    id = id,
    brand = brand,
) {
    companion object {
        const val TYPE = "CAR"
    }
}