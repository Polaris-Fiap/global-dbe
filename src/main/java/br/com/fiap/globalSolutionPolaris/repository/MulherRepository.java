package br.com.fiap.GlobalSolutionPolaris.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.GlobalSolutionPolaris.model.Mulher;

public interface MulherRepository extends JpaRepository<Mulher, Long> {
    Optional<Mulher> findByEmail(String email);
}
