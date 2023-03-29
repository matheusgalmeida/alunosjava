package br.com.uniamerica.alunos.repository;

import br.com.uniamerica.alunos.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Long> {
}
