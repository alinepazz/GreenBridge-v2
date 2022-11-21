package com.example.greenBridge.controllers;

import com.example.greenBridge.dtos.UsuarioDto;
import com.example.greenBridge.models.ProjetoModel;
import com.example.greenBridge.models.UsuarioModel;
import com.example.greenBridge.services.UsuarioService;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/users")
public class UsuarioController {

    final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<Object> saveUser(@RequestBody @Valid UsuarioDto usuarioDTO) {

        var usuarioModel =new UsuarioModel();
        BeanUtils.copyProperties(usuarioDTO, usuarioModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.save(usuarioModel));
        }

    @GetMapping
    public ResponseEntity<Page<UsuarioModel>>getAllProject(
            @PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.ASC)Pageable pageable){
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.findAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object>getOneProject(@PathVariable(value = "id")UUID id){
        Optional<UsuarioModel>usuarioModelOptional = usuarioService.findById(id);
        if (usuarioModelOptional.get().getEmail() != "")
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Email ou senha incorretos.");

        return ResponseEntity.status(HttpStatus.OK).body(usuarioModelOptional.get());
    }

}
