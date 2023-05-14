package nl.jonivan.jpademo.converter

import jakarta.transaction.NotSupportedException
import nl.jonivan.jpademo.entity.Bus
import nl.jonivan.jpademo.entity.Car
import nl.jonivan.jpademo.entity.Vehicle
import nl.jonivan.jpademo.model.Vehicle as VehicleModel
import nl.jonivan.jpademo.model.Car as CarModel
import nl.jonivan.jpademo.model.Bus as BusModel

fun Vehicle.toModel(): VehicleModel {
    return when(this) {
        is Car -> this.toModel()
        is Bus -> this.toModel()
        else -> throw NotSupportedException("Something went wrong")
    }
}

fun Car.toModel(): CarModel = CarModel(
    id = this.id,
    brand = this.brand,
    isCar = this.isCar
)

fun Bus.toModel(): BusModel = BusModel(
    id = this.id,
    brand = this.brand,
    isBus = isBus
)