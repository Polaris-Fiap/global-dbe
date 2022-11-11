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

import br.com.fiap.Challengesprint3.model.Mulher;
import br.com.fiap.Challengesprint3.service.MulherService;

@RestController
@RequestMapping("api/mulher")
public class MulherController {

    @Autowired
    private MulherService service;

    @PostMapping
    public ResponseEntity<Mulher> create(@RequestBody @Valid Mulher mulher) {
        service.save(mulher);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(mulher);
    }

    @GetMapping
    public List<Mulher> getList() {
        return service.listAll();
    }

    @PutMapping("{id}")
    public ResponseEntity<Mulher> updateMulherById(@PathVariable Long id, @RequestBody @Valid Mulher novaMulher) {
        var optional = service.getById(id);

        if (optional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        var mulher = optional.get();
        BeanUtils.copyProperties(novaMulher, mulher);
        mulher.setCodMulher(id);

        service.save(mulher);
        return ResponseEntity.ok(mulher);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> deletePacienteById(@PathVariable Long id) {

        var optional = service.getById(id);

        if (optional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        service.remove(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping("{id}")
    public ResponseEntity<Mulher> getMulherById(@PathVariable Long id) {
        return ResponseEntity.of(service.getById(id));
    }
}
