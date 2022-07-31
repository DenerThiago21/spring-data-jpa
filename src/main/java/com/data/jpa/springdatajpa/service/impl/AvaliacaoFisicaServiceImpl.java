package com.data.jpa.springdatajpa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.jpa.springdatajpa.entity.Aluno;
import com.data.jpa.springdatajpa.entity.AvaliacaoFisica;
import com.data.jpa.springdatajpa.entity.form.AvaliacaoFisicaForm;
import com.data.jpa.springdatajpa.entity.form.AvaliacaoFisicaFormUpdate;
import com.data.jpa.springdatajpa.repository.AlunoRepository;
import com.data.jpa.springdatajpa.repository.AvaliacaoFisicaRepository;
import com.data.jpa.springdatajpa.service.AvaliacaoFisicaService;



@Service
public class AvaliacaoFisicaServiceImpl implements AvaliacaoFisicaService {

    //injecao de dependencia
    @Autowired
    private AvaliacaoFisicaRepository repository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
        AvaliacaoFisica avaliacao = new AvaliacaoFisica();
        
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

        avaliacao.setAluno(aluno);
        avaliacao.setAltura(form.getAltura());
        avaliacao.setPeso(form.getPeso());

        avaliacao.setAluno(aluno);
       
        return repository.save(avaliacao);
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public AvaliacaoFisica get(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<AvaliacaoFisica> getAll() {
        return null;
    }

    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaFormUpdate formUpdate) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
