package com.easybite.easyshool.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Oznacza, że to jest kontroler Spring Boot
@RequestMapping("/api") // Definiuje podstawowy adres URL dla tego kontrolera
public class MyRestController {

    @GetMapping("/hello") // Obsługuje żądanie GET na ścieżce /api/hello
    public String sayHello() {
        return "Hello, Spring Boot! To ja Łukasz Bola jestem bardzo zadowolony że stworzyłem swój pierwszy service w springu! xD"; // Zwraca tekst do użytkownika
    }
}

