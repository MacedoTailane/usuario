package com.tailane.usuario.infrastructure.repository;

import com.tailane_estudos.curso_spring.infrastructure.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
}
