package com.data.jpa.springdatajpa.service;

import java.util.List;

import com.data.jpa.springdatajpa.entity.Matricula;
import com.data.jpa.springdatajpa.entity.form.MatriculaForm;

public interface MatriculaService {
    Matricula create(MatriculaForm form);
    Matricula get(Long id);
    List<Matricula> getAll();
    void delete(Long id);
}
