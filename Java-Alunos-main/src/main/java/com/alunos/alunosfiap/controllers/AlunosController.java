package com.alunos.alunosfiap.controllers;

import com.alunos.alunosfiap.models.AlunosModel;
import com.alunos.alunosfiap.services.AlunosService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/alunos")
public class AlunosController {

    final
    AlunosService alunosService;

    public AlunosController(AlunosService alunosService) {
        this.alunosService = alunosService;
    }

    @GetMapping("")
    public String Get(){
        return "Ola";
    }


    @PostMapping()
    public ResponseEntity<Object> saveAluno(@RequestBody AlunosModel alunosModel){
        try{
            return ResponseEntity.status(HttpStatus.CREATED).body(alunosService.save(alunosModel));
        } catch (Exception excecao) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(excecao);
        }
    }
}
