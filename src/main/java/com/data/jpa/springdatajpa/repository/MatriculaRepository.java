package com.data.jpa.springdatajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.data.jpa.springdatajpa.entity.Matricula;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long>{

    // utilizando JPQL
    /*utiliza a annotation
     * @Query("FROM Matricula m WHERE m.aluno.bairro = :bairro")
     */

    // utilizando query  nativa do SGBD
    /*utiliza a annotation
     * @Query("SELECT * FROM tb_matriculas m " +
     *         "INNER JOIN tb_alunos a ON m.aluno_id = a.id " +
     *          "WHERE a.bairro = :bairro", nativeQuery = true)
     */
    
     // sem a annotation query
    List<Matricula> findByAlunoBairro(String bairro);
}
