package com.example.ecommercebackend.dto;

import com.example.ecommercebackend.user.Role;
import lombok.Data;

@Data
public class RegisterRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}