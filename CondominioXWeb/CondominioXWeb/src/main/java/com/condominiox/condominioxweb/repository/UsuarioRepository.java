package com.condominiox.condominioxweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.condominiox.condominioxweb.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByNomeUsuario(String nomeUsuario);
}