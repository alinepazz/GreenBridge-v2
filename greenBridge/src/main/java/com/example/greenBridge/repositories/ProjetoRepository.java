package com.example.greenBridge.repositories;

import com.example.greenBridge.models.ProjetoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProjetoRepository extends JpaRepository<ProjetoModel, UUID> {
}
