package nl.jonivan.jpademo.services

import nl.jonivan.jpademo.converter.toModel
import nl.jonivan.jpademo.entity.Vehicle
import nl.jonivan.jpademo.model.Car as CarModel
import nl.jonivan.jpademo.repository.VehicleRepository
import org.springframework.stereotype.Service

@Service
class VehicleService(
    private val vehicleRepository: VehicleRepository
) {

    fun getCarsByBrands(brands: List<String>): List<CarModel> {
        val cars = vehicleRepository.findByBrands(brands)
        return cars.map { it.toModel() }
    }
}