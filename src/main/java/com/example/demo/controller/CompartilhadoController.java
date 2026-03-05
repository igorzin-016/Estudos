package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/compartilhado")
@CrossOrigin(origins = "*")
public class CompartilhadoController {

    // Essa é a nossa "memória" temporária no servidor
    private List<String> mural = new ArrayList<>(List.of(
        "👋 Bem-vindo ao mural da turma!",
        "📚 A aula de Java IO já está disponível."
    ));

    // O GET é o que o seu site já está usando para BUSCAR os dados
    @GetMapping
    public List<String> buscarConteudos() {
        return mural;
    }

    // O POST é o que vamos usar para ENVIAR novos dados do site pro servidor
    @PostMapping
    public String adicionarConteudo(@RequestBody String novoConteudo) {
        mural.add(novoConteudo);
        return "Salvo com sucesso!";
    }
}
