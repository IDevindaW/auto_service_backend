package com.EAD.autoservice_backend.exception;

/**
 * Custom exception for user registration conflicts
 */
public class UserAlreadyExistsException extends RuntimeException {
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}