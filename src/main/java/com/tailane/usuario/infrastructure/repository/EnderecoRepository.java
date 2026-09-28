package com.tailane.usuario.infrastructure.repository;

import com.tailane_estudos.curso_spring.infrastructure.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
