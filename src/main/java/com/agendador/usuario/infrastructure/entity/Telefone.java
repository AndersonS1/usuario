package com.agendador.usuario.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity // para apontar que essa classe é uma tabela
@Table(name="telefones")  // anotação para indicar o nome da tabela
@Builder

public class Telefone {
    // na criação da tabela, as anotações @Id, @GeneratedValue(strategy = GenerationType.IDENTITY) e private long id; - SÃO PADRÃO.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Para gerar automaticamente os ID

    private Long id;

    @Column(name = "numero", length = 10)
    private String numero;
    @Column(name = "ddd", length = 3)
    private String ddd;
    }

