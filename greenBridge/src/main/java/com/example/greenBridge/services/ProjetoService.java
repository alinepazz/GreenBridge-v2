package com.example.greenBridge.services;

import com.example.greenBridge.models.ProjetoModel;
import com.example.greenBridge.repositories.ProjetoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;
import java.util.UUID;

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

    public Page<ProjetoModel> findAll(Pageable pageable) {
        return projetoRepository.findAll(pageable);
    }

    public Optional<ProjetoModel> findById(UUID id) {
        return projetoRepository.findById(id);
    }

    @Transactional
    public void delete(ProjetoModel projetoModel) {
         projetoRepository.delete(projetoModel);
    }
}
