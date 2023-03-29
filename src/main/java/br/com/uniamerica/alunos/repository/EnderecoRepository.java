package br.com.uniamerica.alunos.repository;

import br.com.uniamerica.alunos.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
