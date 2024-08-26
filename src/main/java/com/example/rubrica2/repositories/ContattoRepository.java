package com.example.rubrica2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.rubrica2.models.Contatto;

public interface ContattoRepository extends JpaRepository<Contatto, Integer> {
}