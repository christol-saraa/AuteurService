package com.example.auteurservice.repository;

import com.example.auteurservice.entity.Auteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuteurRepository extends JpaRepository<Auteur, Long> {

}