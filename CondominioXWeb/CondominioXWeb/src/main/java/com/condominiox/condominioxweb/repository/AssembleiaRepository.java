package com.condominiox.condominioxweb.repository;

import com.condominiox.condominioxweb.model.Assembleia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssembleiaRepository extends JpaRepository<Assembleia, Long> {
    // Método para buscar uma assembleia pela data (assumindo que a data seja única)
    Assembleia findByDataAssembleia(String dataAssembleia);
}