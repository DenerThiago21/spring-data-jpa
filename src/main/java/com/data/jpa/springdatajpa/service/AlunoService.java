package com.data.jpa.springdatajpa.service;

import java.util.List;

import com.data.jpa.springdatajpa.entity.Aluno;
import com.data.jpa.springdatajpa.entity.AvaliacaoFisica;
import com.data.jpa.springdatajpa.entity.form.AlunoForm;
import com.data.jpa.springdatajpa.entity.form.AlunoFormUpdate;

public interface AlunoService {
    Aluno create(AlunoForm form);
    Aluno get(Long id);
    List<Aluno>getAll(String dataNascimento);
    List<AvaliacaoFisica> getAllAvaliacaoFisica(Long id);
    Aluno update(Long id, AlunoFormUpdate formAluno);
    void delete(Long id);
}
