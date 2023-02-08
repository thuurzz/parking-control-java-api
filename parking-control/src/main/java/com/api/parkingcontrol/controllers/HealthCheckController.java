package com.api.parkingcontrol.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HealthCheckController {
    @GetMapping(produces = {"application/json"})
    public ResponseEntity<String> getStatistics() {
        String health = "{\"health\": \"server ok!\"}";
        return ResponseEntity.ok(health);
    }
}
