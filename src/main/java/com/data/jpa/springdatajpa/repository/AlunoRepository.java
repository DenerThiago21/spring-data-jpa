package com.data.jpa.springdatajpa.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.data.jpa.springdatajpa.entity.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    /**
     * 
     * @param dataNascimento - data de nascimento dos alunos
     * @return lista com todos os alunos que tem a data de nascimento passado por parametro na function
     */
    List<Aluno> findByDataNascimento(LocalDate dataNascimento);
}
