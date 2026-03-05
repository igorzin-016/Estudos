package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin(origins = "*") 
public class OlaController {

    @GetMapping("/api/teste")
    public String teste() {
        return "A API do Igor está viva e respondendo no Render! 🚀";
    }
}
