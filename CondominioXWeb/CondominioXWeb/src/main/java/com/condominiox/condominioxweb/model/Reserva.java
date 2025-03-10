package com.condominiox.condominioxweb.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Reserva")
public class Reserva {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    // Associação com o usuário que fez a reserva
    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;
    
    // Esse campo mapeia a coluna "nomeUsuario" da tabela Reserva,
    // que no seu caso armazenará o nome da área comum reservada.
    @Column(name = "nomeUsuario", nullable = false)
    private String nomeAreaComum;
    
    // Associação com a área comum (usando a coluna id_area_comum)
    @ManyToOne
    @JoinColumn(name = "id_area_comum", nullable = false)
    private AreaComum areaComum;
    
    // Data da reserva
    @Column(name = "data_reserva", nullable = false)
    private Date dataReserva;
}