package nl.jonivan.jpademo.entity

import jakarta.persistence.*
import java.util.UUID

//@Entity
@Table(name = "vehicles")
@DiscriminatorColumn(name = "vehicle_type", discriminatorType = DiscriminatorType.STRING)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@MappedSuperclass
abstract class Vehicle(
    @Id
    open var id: UUID,
    @Column(name = "brand")
    open var brand: String,
)