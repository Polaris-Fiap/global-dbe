package br.com.fiap.globalSolutionPolaris.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.globalSolutionPolaris.model.AvaliacaoLocal;

@Repository
public interface AvaliacaoLocalRepository extends JpaRepository < AvaliacaoLocal, Long >{
    
}
