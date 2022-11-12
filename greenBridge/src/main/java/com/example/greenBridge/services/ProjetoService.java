package com.example.greenBridge.services;

import com.example.greenBridge.models.ProjetoModel;
import com.example.greenBridge.repositories.ProjetoRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ProjetoService {
    final ProjetoRepository projetoRepository;

    public ProjetoService(ProjetoRepository projetoRepository) {
        this.projetoRepository = projetoRepository;
    }

    @Transactional
    public ProjetoModel save(ProjetoModel projetoModel) {
        return projetoRepository.save(projetoModel);
    }
}