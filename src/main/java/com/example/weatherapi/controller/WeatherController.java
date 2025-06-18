package com.example.weatherapi.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.Map;

@RestController
@RequestMapping("/weather")
public class WeatherController {
    @GetMapping
    public ResponseEntity<?> getWeather(@RequestParam String city) {
        Map<String, Object> response = Map.of(
            "city", city,
            "temperature", 25.0,
            "unit", "Celsius"
        );
        return ResponseEntity.ok(response);
    }
}