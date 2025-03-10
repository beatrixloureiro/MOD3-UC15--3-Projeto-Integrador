package com.condominiox.condominioxweb.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Assembleia")
public class Assembleia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    // Armazena a data da assembleia (pode ser armazenado como String ou Date – neste exemplo, usamos String)
    @Column(name = "data_assembleia")
    private String dataAssembleia;
    
    // Armazena os IDs dos usuários participantes em formato CSV (ex.: "1,2,3")
    @Column(name = "ids_usuarios")
    private String idsUsuarios;
    
    // Armazena os nomes dos usuários participantes em formato CSV (ex.: "João, Maria, Pedro")
    @Column(name = "nomes_usuarios")
    private String nomesUsuarios;
}