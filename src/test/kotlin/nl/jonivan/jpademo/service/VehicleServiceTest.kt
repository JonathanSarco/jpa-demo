package nl.jonivan.jpademo.service

import nl.jonivan.jpademo.repository.VehicleRepository
import nl.jonivan.jpademo.services.VehicleService
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.testcontainers.junit.jupiter.Testcontainers

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@Testcontainers
@ActiveProfiles("test-containers-flyway")
class VehicleServiceTest(
    @Autowired private val vehicleRepository: VehicleRepository,
    @Autowired private val vehicleService: VehicleService
) {

    @Test
    fun shouldReturnVehicles() {
        val list = vehicleService.getCarsByBrands(listOf("Audi"))
        assert(list.isEmpty())
    }
}