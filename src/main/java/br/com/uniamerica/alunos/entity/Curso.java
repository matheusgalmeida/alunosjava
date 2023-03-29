package br.com.uniamerica.alunos.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "tb_cursos",schema = "public")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Getter @Setter
    @Column(name = "nome",nullable = false)
    private String nome;

    @Getter @Setter
    @Column(name = "cargaHoraria",nullable = false)
    private String cargaHoraria;

    @Getter @Setter
    @ManyToMany
    @JoinTable(name = "curso_tem_alunos",joinColumns = {@JoinColumn(name = "id_curso")},inverseJoinColumns = {@JoinColumn(name = "id_aluno")})
    private List<Aluno> alunos;

}

