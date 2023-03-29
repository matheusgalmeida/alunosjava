package br.com.uniamerica.alunos.repository;

import br.com.uniamerica.alunos.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
