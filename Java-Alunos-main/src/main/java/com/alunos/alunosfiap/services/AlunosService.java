package com.alunos.alunosfiap.services;

import com.alunos.alunosfiap.models.AlunosModel;
import com.alunos.alunosfiap.repositories.AlunosRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunosService {

    final
    AlunosRepository alunosRepository;

    public AlunosService(AlunosRepository alunosRepository) {
        this.alunosRepository = alunosRepository;
    }


    @Transactional
    public AlunosModel save(AlunosModel alunosModel) {
        return alunosRepository.save(alunosModel);
    }

}
