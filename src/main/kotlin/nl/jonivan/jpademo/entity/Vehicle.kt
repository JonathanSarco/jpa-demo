package nl.jonivan.jpademo.entity

import jakarta.persistence.*
import java.util.UUID

@Entity
@Table(name = "vehicles")
@DiscriminatorColumn(name = "public_transport")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
abstract class Vehicle(
    @Id
    open var id: UUID,
    @Column(name = "brand")
    open var brand: String,
)