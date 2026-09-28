package com.tailane.usuario.infrastructure.repository;

import com.tailane_estudos.curso_spring.infrastructure.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository <Usuario,Long> {
    boolean existsByEmail(String email);

    //evita o retorno de informações nulas.

    Optional<Usuario> findByEmail(String email);
}
