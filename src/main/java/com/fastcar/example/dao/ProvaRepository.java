package com.fastcar.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fastcar.example.model.Prova;

public interface ProvaRepository extends JpaRepository<Prova, Long> {

}
