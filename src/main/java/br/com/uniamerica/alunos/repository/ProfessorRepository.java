package br.com.uniamerica.alunos.repository;

import br.com.uniamerica.alunos.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
