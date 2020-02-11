package br.felipe.treinamento.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.felipe.treinamento.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long>{

	List<Topico> findByCurso_Nome(String nomeCurso);

}
