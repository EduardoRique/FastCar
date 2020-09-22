package com.fastcar.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fastcar.example.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
