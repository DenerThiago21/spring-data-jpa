package com.data.jpa.springdatajpa.entity;

import java.time.LocalDateTime;

public class AvaliacaoFisica {
    
    private Long id;

    private Aluno aluno;

    private LocalDateTime dataAvaliacao = LocalDateTime.now();

    private double peso;

    private double altura;
}
