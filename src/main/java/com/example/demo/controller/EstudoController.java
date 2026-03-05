package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*") // Isso permite que seu HTML acesse a API
public class EstudoController {

    @GetMapping("/api/status")
    public String getStatus() {
        return "API de Estudos Online! Pronto para codar, Igor?";
    }
}