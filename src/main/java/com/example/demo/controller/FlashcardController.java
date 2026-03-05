package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/flashcards")
@CrossOrigin(origins = "*")
public class FlashcardController {

    // Criando uma lista na memória para simular nosso banco de dados por enquanto
    private List<Flashcard> muralDaTurma = new ArrayList<>();

    // O @GetMapping serve para o seu site BUSCAR as perguntas (ex: carregar os flashcards da sua amiga)
    @GetMapping
    public List<Flashcard> listarFlashcards() {
        return muralDaTurma;
    }

    // O @PostMapping serve para o seu site ENVIAR uma nova pergunta para o servidor
    @PostMapping
    public Flashcard adicionarFlashcard(@RequestBody Flashcard novoCard) {
        muralDaTurma.add(novoCard);
        return novoCard;
    }

    // A estrutura do nosso "Cartão" de estudo
    static class Flashcard {
        public String disciplina;
        public String historinha;
        public String solucaoCodigo;
    }
}
