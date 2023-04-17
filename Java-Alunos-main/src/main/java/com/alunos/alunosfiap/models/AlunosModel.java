package com.alunos.alunosfiap.models;

import com.alunos.alunosfiap.annotations.StringAlunos;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_ALUNOS")
public class AlunosModel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, length = 100)
    @StringAlunos()
    private String Nome;

    @Column(nullable = false, unique = true, length = 10)
    private String RM;
}
