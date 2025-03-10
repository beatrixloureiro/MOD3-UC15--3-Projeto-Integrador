package com.condominiox.condominioxweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.condominiox.condominioxweb.model.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
    // Métodos customizados podem ser adicionados aqui, se necessário
}