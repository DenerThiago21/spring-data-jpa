package com.data.jpa.springdatajpa.entity.form;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoFormUpdate {
    
    private String nome;

    private String bairro;

    private LocalDate dataNascimento;
}
