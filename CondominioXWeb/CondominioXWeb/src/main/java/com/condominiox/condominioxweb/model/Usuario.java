package com.condominiox.condominioxweb.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Usuario")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    // Mapeie para "nomeUsuario", pois o Hibernate está gerando a consulta para esse nome
    @Column(name = "nomeUsuario")
    private String nomeUsuario;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "senha")
    private String senha;
    
    // Mapeie para "tipoUsuario"
    @Column(name = "tipoUsuario")
    private String tipoUsuario; // Ex: "Morador", "Síndico", "Administrador"
}