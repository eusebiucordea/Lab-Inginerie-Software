package com.parking.parkinglot.common;

public class UserDto {
    public String getId() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public UserDto(String username, String email) {
        this.username = username;
        this.email = email;
    }

    private String username;

    private String email;
}
