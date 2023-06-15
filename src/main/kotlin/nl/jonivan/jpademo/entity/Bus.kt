package nl.jonivan.jpademo.entity

import jakarta.persistence.Column
import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity
import nl.jonivan.jpademo.entity.Bus.Companion.TYPE
import java.util.*

@Entity
@DiscriminatorValue(value = TYPE)
class Bus(
    override var id: UUID,
    override var brand: String,
    @Column(name = "is_bus")
    val isBus: Boolean
): Vehicle(
    id = id,
    brand = brand
) {
    companion object {
        const val TYPE = "BUS"
    }
}