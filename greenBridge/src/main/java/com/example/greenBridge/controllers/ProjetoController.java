package com.example.greenBridge.controllers;

import com.example.greenBridge.dtos.ProjetoDto;
import com.example.greenBridge.models.ProjetoModel;
import com.example.greenBridge.services.ProjetoService;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/projects")
public class ProjetoController {

    final ProjetoService projetoService;

    public ProjetoController(ProjetoService projetoService) {
        this.projetoService = projetoService;
    }

    @PostMapping
    public ResponseEntity<Object> saveProjeto(@RequestBody @Valid ProjetoDto projetoDto) {

        var projetoModel =new ProjetoModel();
        BeanUtils.copyProperties(projetoDto, projetoModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(projetoService.save(projetoModel));
        }

    @GetMapping
    public ResponseEntity<Page<ProjetoModel>>getAllProjeto(
            @PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.ASC)Pageable pageable){
        return ResponseEntity.status(HttpStatus.OK).body(projetoService.findAll(pageable));
    }

    
}
