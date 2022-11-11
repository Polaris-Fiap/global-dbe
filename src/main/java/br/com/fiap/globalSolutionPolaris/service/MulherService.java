package br.com.fiap.GlobalSolutionPolaris.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.fiap.GlobalSolutionPolaris.model.Mulher;
import br.com.fiap.GlobalSolutionPolaris.repository.MulherRepository;

@Service
@Transactional
public class MulherService {

    @Autowired
    MulherRepository repository;

    @Autowired
    PasswordEncoder passwordEncoder;

    public void save(Mulher mulher) {
        mulher.setSenha(passwordEncoder.encode(mulher.getPassword()));
        repository.save(mulher);
    }

    public List<Mulher> listAll() {
        return repository.findAll();
    }

    public void remove(Long id) {
        repository.deleteById(id);
    }

    public Optional<Mulher> getById(Long id) {
        return repository.findById(id);
    }

}
