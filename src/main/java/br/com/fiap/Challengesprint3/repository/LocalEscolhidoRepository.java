package br.com.fiap.Challengesprint3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.Challengesprint3.model.LocalEscolhido;

@Repository
public interface LocalEscolhidoRepository extends JpaRepository<LocalEscolhido, Long> {

}
