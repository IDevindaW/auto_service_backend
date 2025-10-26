package com.EAD.autoservice_backend.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Standalone utility to generate BCrypt hashed passwords.
 * Run via Java command line for team use (e.g., to hash 'adminpwd').
 */
public class PasswordGenerator {

    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
        String rawPassword = (args.length > 0) ? args[0] : "adminpwd"; // Default password
        String hashedPassword = encoder.encode(rawPassword);
        System.out.println("Hashed Password for '" + rawPassword + "': " + hashedPassword);
        System.out.println("Copy this hash for DB insert (e.g., into users.password).");
    }
}