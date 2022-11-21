package com.example.greenBridge.services;

import com.example.greenBridge.models.ProjetoModel;
import com.example.greenBridge.models.UsuarioModel;
import com.example.greenBridge.repositories.UsuarioRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;
import java.util.UUID;

@Service
public class UsuarioService {
    final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Transactional
    public UsuarioModel save(UsuarioModel usuarioModel) {
        return usuarioRepository.save(usuarioModel);
    }

    public Page<UsuarioModel> findAll(Pageable pageable) {
        return usuarioRepository.findAll(pageable);
    }

    public Optional<UsuarioModel> findById(UUID id) {
        return usuarioRepository.findById(id);
    }
}
