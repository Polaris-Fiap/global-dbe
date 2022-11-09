package br.com.fiap.globalSolutionPolaris.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.globalSolutionPolaris.model.Mulher;

public interface MulherRepository extends JpaRepository<Mulher, Long>{
    Optional<Mulher> findByEmail(String email);
}
