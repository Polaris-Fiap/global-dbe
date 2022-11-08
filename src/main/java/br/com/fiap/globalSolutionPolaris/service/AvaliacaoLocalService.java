package br.com.fiap.globalSolutionPolaris.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.globalSolutionPolaris.model.AvaliacaoLocal;
import br.com.fiap.globalSolutionPolaris.repository.AvaliacaoLocalRepository;

@Service
public class AvaliacaoLocalService {
    
    @Autowired
    AvaliacaoLocalRepository repository;

    public void save(AvaliacaoLocal avLocal) {
        repository.save(avLocal);
    }

    public List<AvaliacaoLocal> findAll() {
        return repository.findAll();
    }

    public void remove(Long id) {
        repository.deleteById(id);
    }

    public Optional<AvaliacaoLocal> getById(Long id) {
        return repository.findById(id);
    }

}
