package com.EAD.autoservice_backend.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST Controller for Admin operations
 * Protected by @PreAuthorize("hasRole('ADMIN')")
 */
@RestController
@RequestMapping("/api/admin")
public class AdminController {

    /**
     * Admin Dashboard Endpoint
     * Returns basic admin info (extend with user lists, etc.)
     */
    @GetMapping("/dashboard")
    @PreAuthorize("hasRole('ADMIN')")  // Method-level security (backup to config)
    public ResponseEntity<Map<String, String>> dashboard() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Welcome to Admin Portal!");
        response.put("role", "ADMIN");
        response.put("nextSteps", "Manage users, services, bookings here.");
        return ResponseEntity.ok(response);
    }
}