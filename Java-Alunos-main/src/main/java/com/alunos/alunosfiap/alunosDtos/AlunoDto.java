package com.alunos.alunosfiap.alunosDtos;

import com.alunos.alunosfiap.annotations.StringAlunos;
import jakarta.validation.constraints.NotBlank;

public class AlunoDto {

    @StringAlunos
    private String Nome;

    @NotBlank(message = "Nome não deve estar em branco")
    private String RM;


}
