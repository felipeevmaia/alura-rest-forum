package br.felipe.treinamento.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.felipe.treinamento.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

	Curso findByNome(String nome);
	
}
