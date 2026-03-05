package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/compartilhado")
@CrossOrigin(origins = "*")
public class CompartilhadoController {

    // O nosso banco de dados temporário agora guarda Objetos do tipo Mensagem
    private List<Mensagem> chatTurma = new ArrayList<>();

    @GetMapping
    public List<Mensagem> buscarChat() {
        return chatTurma;
    }

    @PostMapping
    public Mensagem enviarMensagem(@RequestBody Mensagem novaMensagem) {
        chatTurma.add(novaMensagem);
        return novaMensagem; // Retorna a mensagem salva
    }

    // A estrutura do nosso Objeto JSON
    static class Mensagem {
        public String autor;
        public String texto;
    }
}
