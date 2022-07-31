package com.data.jpa.springdatajpa.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.data.jpa.springdatajpa.entity.Matricula;
import com.data.jpa.springdatajpa.entity.form.MatriculaForm;
import com.data.jpa.springdatajpa.service.impl.MatriculaServiceImpl;

@RestController
@RequestMapping("/matricula")
public class MatriculaController {
    
    private MatriculaServiceImpl service;

    //injecao de dependencia
    public MatriculaController(MatriculaServiceImpl service) {
        this.service = service;
    }

    @GetMapping
    public List<Matricula> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Matricula create(@RequestBody MatriculaForm form) {
        return service.create(form);
    }
}
