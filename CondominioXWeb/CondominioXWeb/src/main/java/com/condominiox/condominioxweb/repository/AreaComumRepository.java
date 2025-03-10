package com.condominiox.condominioxweb.repository;

import com.condominiox.condominioxweb.model.AreaComum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaComumRepository extends JpaRepository<AreaComum, Long> {
    // Busca única pela combinação de nome e bloco
    AreaComum findByNomeAreaComumAndBloco(String nomeAreaComum, String bloco);
}