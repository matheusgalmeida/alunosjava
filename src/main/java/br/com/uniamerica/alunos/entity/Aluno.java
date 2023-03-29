package br.com.uniamerica.alunos.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_alunos",schema = "public")
public class Aluno {

    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",nullable = false)
    private Long id;



    @Getter @Setter
    @Column(name = "nome",nullable = false)
    private String nome;
    @Getter @Setter
    @Column(name = "cpf",nullable = false)
    private String cpf;

    @Getter @Setter
    @JoinColumn(name = "endereco_id", referencedColumnName = "id", nullable = false)
    @OneToOne
    private Endereco endereco;

}

