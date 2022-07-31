package com.data.jpa.springdatajpa.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.data.jpa.springdatajpa.entity.AvaliacaoFisica;
import com.data.jpa.springdatajpa.entity.form.AvaliacaoFisicaForm;
import com.data.jpa.springdatajpa.service.impl.AvaliacaoFisicaServiceImpl;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

    private AvaliacaoFisicaServiceImpl service;

    // injeção de dependencia por constructor
    public AvaliacaoFisicaController(AvaliacaoFisicaServiceImpl service) {
        this.service = service;
    }
    
    @GetMapping
    public List<AvaliacaoFisica> getAll() {
        return service.getAll();
    }

    @PostMapping
    public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaForm form) {
        return service.create(form);
    }
    
}
