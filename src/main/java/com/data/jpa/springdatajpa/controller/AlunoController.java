package com.data.jpa.springdatajpa.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.data.jpa.springdatajpa.entity.Aluno;
import com.data.jpa.springdatajpa.entity.AvaliacaoFisica;
import com.data.jpa.springdatajpa.entity.form.AlunoForm;
import com.data.jpa.springdatajpa.service.impl.AlunoServiceImpl;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
   
    // injeção de dependencia com autowired
    /*
     * @Autowired
     * private AlunoServiceImpl service;
     */

     
     private AlunoServiceImpl service;
    // injecao de dependencia com constructor
     public AlunoController(AlunoServiceImpl service) {
        this.service = service;
    }

    @GetMapping
    public List<Aluno> getAll(@RequestParam(value = "dataNascimento", required = false) String dataNascimento) {
        return service.getAll(dataNascimento);
    }

    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvaliacaoFisica(@PathVariable Long id) {
        return service.getAllAvaliacaoFisica(id);
    }

    // AlunoForm é a implementacao de um DTO
    @PostMapping
    public Aluno create(@Valid @RequestBody AlunoForm form) {
        return service.create(form);
    }
}
