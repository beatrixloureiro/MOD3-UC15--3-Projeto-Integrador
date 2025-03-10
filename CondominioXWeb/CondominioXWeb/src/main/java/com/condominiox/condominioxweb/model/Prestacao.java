package com.condominiox.condominioxweb.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.math.BigDecimal;
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Relatorio")
public class Prestacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Data de referência do relatório (ex: primeiro dia do mês)
    @Column(name = "mes_referencia", nullable = false)
    private Date mesReferencia;

    // Total de custos do mês
    @Column(name = "total_custos", nullable = false)
    private BigDecimal totalCustos;

    // Total de rendimentos do mês
    @Column(name = "total_rendimentos", nullable = false)
    private BigDecimal totalRendimentos;

    // O saldo é gerado automaticamente no banco (coluna calculada), portanto não deve ser inserido nem atualizado
    @Column(name = "saldo", nullable = false, insertable = false, updatable = false)
    private BigDecimal saldo;
}