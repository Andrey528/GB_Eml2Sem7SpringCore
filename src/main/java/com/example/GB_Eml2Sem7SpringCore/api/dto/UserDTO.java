package com.example.GB_Eml2Sem7SpringCore.api.dto;

// Data Transfer Object - запрос логина и пароля
public record UserDTO (
        String username,
        String password) {}