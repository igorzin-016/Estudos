package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/compartilhado")
@CrossOrigin(origins = "*")
public class CompartilhadoController {

    private List<Mensagem> chatTurma = new ArrayList<>();

    @GetMapping
    public List<Mensagem> buscarChat() {
        return chatTurma;
    }

    @PostMapping
    public Mensagem enviarMensagem(@RequestBody Mensagem novaMensagem) {
        chatTurma.add(novaMensagem);
        return novaMensagem;
    }

    // NOVO: Rota para apagar a mensagem pelo ID
    @DeleteMapping("/{id}")
    public String deletarMensagem(@PathVariable Long id) {
        chatTurma.removeIf(msg -> msg.id != null && msg.id.equals(id));
        return "Apagado com sucesso!";
    }

    // NOVO: Adicionamos o campo 'id'
    static class Mensagem {
        public Long id;
        public String autor;
        public String texto;
    }
}
