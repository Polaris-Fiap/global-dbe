package br.com.fiap.globalSolutionPolaris.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.globalSolutionPolaris.model.LocalEscolhido;

@Repository
public interface LocalEscolhidoRepository extends JpaRepository<LocalEscolhido, Long> {

}
