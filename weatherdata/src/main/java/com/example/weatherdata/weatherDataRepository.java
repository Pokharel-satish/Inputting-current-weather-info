package com.example.weatherdata;

import org.springframework.data.jpa.repository.JpaRepository;

public interface weatherDataRepository extends JpaRepository<weatherData, Long> {
}
