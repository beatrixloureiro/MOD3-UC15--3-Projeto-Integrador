package com.condominiox.condominioxweb.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Cobranca")
public class Cobranca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "taxa_condominio")
    private double taxa_condominio;
    
    @Column(name = "taxa_agua")
    private double taxa_agua;
    
    @Column(name = "taxa_gas")
    private double taxa_gas;
    
    @Column(name = "valor_total")
    private double valor_total;
    
    
    // true = Pago, false = Pendente
    @Column(name = "status_pagamento")
    private boolean status_pagamento;
        
    // Associação com o usuário (morador)
    @ManyToOne
    @JoinColumn(name = "id_morador") // O nome da coluna no BD
    private Usuario morador;
    
}