package com.condominiox.condominioxweb.repository;

import com.condominiox.condominioxweb.model.Prestacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrestacaoRepository extends JpaRepository<Prestacao, Long> {
    // Métodos customizados podem ser adicionados aqui, se necessário.
}