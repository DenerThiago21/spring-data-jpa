package com.data.jpa.springdatajpa.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.data.jpa.springdatajpa.entity.Aluno;
import com.data.jpa.springdatajpa.entity.AvaliacaoFisica;
import com.data.jpa.springdatajpa.entity.form.AlunoForm;
import com.data.jpa.springdatajpa.entity.form.AlunoFormUpdate;
import com.data.jpa.springdatajpa.infra.utils.JavaTimeUtils;
import com.data.jpa.springdatajpa.repository.AlunoRepository;
import com.data.jpa.springdatajpa.service.AlunoService;

@Service
public class AlunoServiceImpl implements AlunoService {

    private AlunoRepository repository;

    //injeção de dependencias via constructor
    public AlunoServiceImpl(AlunoRepository repository) {
        this.repository = repository;
    }

    @Override
    public Aluno create(AlunoForm form) {
        Aluno aluno = new Aluno();

        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataNascimento(form.getDataNascimento());

        repository.save(aluno);
        
        return aluno;
    }

    @Override
    public Aluno get(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Aluno> getAll(String dataNascimento) {

        if(dataNascimento == null) return repository.findAll();

        LocalDate localDate = LocalDate.parse(dataNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER);
        return repository.findByDataNascimento(localDate);
    }

    @Override
    public Aluno update(Long id, AlunoFormUpdate formAluno) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stubx
        
    }

    public List<AvaliacaoFisica> getAllAvaliacaoFisica(Long id) {
        Aluno aluno = repository.findById(id).get();

        return aluno.getAvaliacoes();
    }
    
}
