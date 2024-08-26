package com.example.rubrica2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rubrica2.models.Contatto;
import com.example.rubrica2.repositories.ContattoRepository;

import java.util.List;

@RestController
@RequestMapping("/contatti")
public class ContattoController {

    @Autowired
    private ContattoRepository contattoRepository;

    @PostMapping(consumes = "application/json", produces = "application/json")
    public Contatto creaContatto(@RequestBody Contatto contatto) {
        return contattoRepository.save(contatto);
    }

    @GetMapping
    public List<Contatto> getAllContatti() {
        return contattoRepository.findAll();
    }
}