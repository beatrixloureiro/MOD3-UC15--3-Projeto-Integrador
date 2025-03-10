package com.condominiox.condominioxweb.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "AreaComum", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"nomeAreaComum", "bloco"})
})
public class AreaComum {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nomeAreaComum", nullable = false, length = 100)
    private String nomeAreaComum;

    @Column(name = "descricao", nullable = false, columnDefinition = "TEXT")
    private String descricao;

    @Column(name = "localizacao", nullable = false, length = 100)
    private String localizacao;

    @Column(name = "bloco", nullable = false, length = 1)
    private String bloco;
}