package br.com.fiap.globalSolutionPolaris.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.globalSolutionPolaris.dto.CreateLocalWithUserDto;
import br.com.fiap.globalSolutionPolaris.model.LocalEscolhido;
import br.com.fiap.globalSolutionPolaris.service.LocalEscolhidoService;

@RestController
@RequestMapping("api/localEscolhido")
public class LocalEscolhidoController {
    
    @Autowired
    LocalEscolhidoService service;

    @PostMapping
    public ResponseEntity<CreateLocalWithUserDto> save(@RequestBody @Valid CreateLocalWithUserDto dto) {
        service.saveLocalWithUser(dto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(dto);
    }

    @GetMapping
    public List<LocalEscolhido> getLocal() {
        return service.findAll();
    }
}
