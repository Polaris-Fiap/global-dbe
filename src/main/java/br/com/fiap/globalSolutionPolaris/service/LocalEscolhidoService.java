package br.com.fiap.globalSolutionPolaris.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.globalSolutionPolaris.model.LocalEscolhido;
import br.com.fiap.globalSolutionPolaris.repository.LocalEscolhidoRepository;

@Service
public class LocalEscolhidoService {
    
    @Autowired
    LocalEscolhidoRepository repository;

    public void save(LocalEscolhido avLocal) {
        repository.save(avLocal);
    }

    public List<LocalEscolhido> findAll() {
        return repository.findAll();
    }

    public void remove(Long id) {
        repository.deleteById(id);
    }

    public Optional<LocalEscolhido> getById(Long id) {
        return repository.findById(id);
    }
}
