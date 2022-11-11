package br.com.fiap.Challengesprint3.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.Challengesprint3.dto.CreateLocalWithUserDto;
import br.com.fiap.Challengesprint3.model.LocalEscolhido;
import br.com.fiap.Challengesprint3.model.Mulher;
import br.com.fiap.Challengesprint3.service.LocalEscolhidoService;

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

    @DeleteMapping("{id}")
    public ResponseEntity<Object> deleteLocalById(@PathVariable Long id) {

        var optional = service.getById(id);

        if (optional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        service.remove(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping("{id}")
    public ResponseEntity<LocalEscolhido> updateLocalById(@PathVariable Long id,
            @RequestBody @Valid LocalEscolhido novoLocal) {
        var optional = service.getById(id);

        if (optional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        var local = optional.get();
        Mulher mulher = local.getMulher();

        BeanUtils.copyProperties(novoLocal, local);
        local.setCodLocal(id);
        local.setMulher(mulher);

        service.save(local);
        return ResponseEntity.ok(local);
    }

    @GetMapping("{id}")
    public ResponseEntity<LocalEscolhido> getLocalById(@PathVariable Long id) {
        return ResponseEntity.of(service.getById(id));
    }
}
