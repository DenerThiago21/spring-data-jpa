package com.data.jpa.springdatajpa.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.data.jpa.springdatajpa.entity.Aluno;
import com.data.jpa.springdatajpa.entity.Matricula;
import com.data.jpa.springdatajpa.entity.form.MatriculaForm;
import com.data.jpa.springdatajpa.repository.AlunoRepository;
import com.data.jpa.springdatajpa.repository.MatriculaRepository;
import com.data.jpa.springdatajpa.service.MatriculaService;

@Service
public class MatriculaServiceImpl implements MatriculaService{
    
    private MatriculaRepository repository;

    private AlunoRepository alunoRepository;

    //injecao de dependencia
    public MatriculaServiceImpl(MatriculaRepository repository, AlunoRepository alunoRepository) {
        this.repository = repository;
        this.alunoRepository = alunoRepository;
    }

    @Override
    public Matricula create(MatriculaForm form) {
        Matricula matricula = new Matricula();
        
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();
        
        matricula.setAluno(aluno);

        return (Matricula) repository.save(matricula);
    }

    @Override
    public Matricula get(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Matricula> getAll() {
        return repository.findAll();
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        
    }


}
