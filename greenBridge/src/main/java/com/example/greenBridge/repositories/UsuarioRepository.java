package com.example.greenBridge.repositories;

import com.example.greenBridge.models.ProjetoModel;
import com.example.greenBridge.models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, UUID> {
}
