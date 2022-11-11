package br.com.fiap.GlobalSolutionPolaris.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.GlobalSolutionPolaris.model.LocalEscolhido;

@Repository
public interface LocalEscolhidoRepository extends JpaRepository<LocalEscolhido, Long> {

}
