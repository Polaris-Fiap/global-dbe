package br.com.fiap.Challengesprint3.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.Challengesprint3.model.Mulher;

public interface MulherRepository extends JpaRepository<Mulher, Long> {
    Optional<Mulher> findByEmail(String email);
}
