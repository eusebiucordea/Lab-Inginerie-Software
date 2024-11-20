package com.parking.parkinglot.common;

public class UserDto {
    private String username;
    private String email;

    // Constructor
    public UserDto(String username, String email) {
        this.username = username;
        this.email = email;
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}
