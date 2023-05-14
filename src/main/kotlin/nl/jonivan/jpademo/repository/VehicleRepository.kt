package nl.jonivan.jpademo.repository

import nl.jonivan.jpademo.entity.Car
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface VehicleRepository: JpaRepository<Car, Long> {

    @Query("""
        SELECT *
        FROM vehicles ve
        WHERE ve.brand IN (:brands)
    """,
        nativeQuery = true)
    fun findByBrands(@Param("brands") brands: List<String>): List<Car>
}