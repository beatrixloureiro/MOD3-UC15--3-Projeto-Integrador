package com.condominiox.condominioxweb.repository;

import com.condominiox.condominioxweb.model.Solicitacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitacaoRepository extends JpaRepository<Solicitacao, Long> {
    // Métodos customizados podem ser adicionados se necessário
}