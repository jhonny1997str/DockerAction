package com.javatechie.cicd.repository;

import com.javatechie.cicd.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface usuarioRepository extends JpaRepository <Usuario, Long> {
}
