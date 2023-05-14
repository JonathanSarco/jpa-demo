package nl.jonivan.jpademo.controller

import nl.jonivan.jpademo.services.VehicleService
import org.springframework.http.MediaType.APPLICATION_JSON_VALUE
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/vehicles")
class VehicleController(
    private val vehicleService: VehicleService
) {

    @GetMapping("/byBrands", produces = [APPLICATION_JSON_VALUE])
    fun getCarsByBrand(@RequestParam brands: List<String>) = vehicleService.getCarsByBrands(brands)
}