package com.example.GB_Eml2Sem7SpringCore.api.controller;

import com.example.GB_Eml2Sem7SpringCore.service.JwtTokenService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class TestController { // К этому контроллеру пытаемся получить доступ, используем токен безопасности

    private final JwtTokenService service;

    @Autowired
    public TestController(JwtTokenService service) {
        this.service = service;
    }

    @GetMapping("/hello")
    public ResponseEntity<String> testEndpoint(HttpServletRequest httpServletRequest){ // Токен достается из запроса сервлета

        int userId = service.getUserIdFromToken(httpServletRequest);

        return new ResponseEntity<>( "Hello World!" +  userId, HttpStatus.OK);
    }
}
