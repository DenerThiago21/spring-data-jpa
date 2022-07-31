package com.data.jpa.springdatajpa.entity.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatriculaForm {
    
    @NotNull(message = "preencha o campo corretamente")
    @Positive(message = "o id do aluno tem que ser positivo")
    private Long alunoId;
}
