package com.data.jpa.springdatajpa.service;

import java.util.List;

import com.data.jpa.springdatajpa.entity.AvaliacaoFisica;
import com.data.jpa.springdatajpa.entity.form.AvaliacaoFisicaForm;
import com.data.jpa.springdatajpa.entity.form.AvaliacaoFisicaFormUpdate;

public interface AvaliacaoFisicaService {
    AvaliacaoFisica create(AvaliacaoFisicaForm form);
    AvaliacaoFisica get(Long id);
    List<AvaliacaoFisica>getAll();
    AvaliacaoFisica update(Long id, AvaliacaoFisicaFormUpdate formUpdate);
    void delete(Long id);
}
