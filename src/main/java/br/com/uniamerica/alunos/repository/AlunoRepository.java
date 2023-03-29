package br.com.uniamerica.alunos.repository;

import br.com.uniamerica.alunos.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
