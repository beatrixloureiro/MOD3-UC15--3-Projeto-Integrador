package com.condominiox.condominioxweb.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Solicitacao")
public class Solicitacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Associação com o usuário (morador) que enviou a solicitação.
    // Isso mapeará o campo id_morador na tabela, conforme o script SQL.
    @ManyToOne
    @JoinColumn(name = "id_morador", nullable = false)
    private Usuario usuario;

    // Usaremos a propriedade "titulo" para representar o tipo de solicitação.
    // Ela será mapeada para a coluna "tipo_solicitacao".
    @Column(name = "tipo_solicitacao", nullable = false)
    private String titulo;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    @Column(name = "atendido", nullable = false)
    private Boolean atendido = false;

    // Mapeado para a coluna data_solicitacao
    @Column(name = "data_solicitacao")
    private LocalDateTime dataEnvio = LocalDateTime.now();
}