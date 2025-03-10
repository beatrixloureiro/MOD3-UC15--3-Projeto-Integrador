package com.condominiox.condominioxweb.repository;

import com.condominiox.condominioxweb.model.Cobranca;
import com.condominiox.condominioxweb.model.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
   public interface CobrancaRepository extends JpaRepository<Cobranca, Long> {
    List<Cobranca> findByMorador(Usuario morador);
}

