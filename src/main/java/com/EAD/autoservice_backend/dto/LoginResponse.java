package com.EAD.autoservice_backend.dto;

/**
 * DTO for login response sent to React frontend
 * Contains JWT token and user information
 */
public class LoginResponse {
    private String token;
    private String tokenType = "Bearer";
    private String username;
    private String email;
    private String role;

    // Constructors
    public LoginResponse() {}

    public LoginResponse(String token, String username, String email, String role) {
        this.token = token;
        this.username = username;
        this.email = email;
        this.role = role;
    }

    // Getters and Setters
    public String getToken() { return token; }
    public void setToken(String token) { this.token = token; }

    public String getTokenType() { return tokenType; }
    public void setTokenType(String tokenType) { this.tokenType = tokenType; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
}