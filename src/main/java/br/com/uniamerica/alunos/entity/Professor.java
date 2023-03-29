package br.com.uniamerica.alunos.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "tb_profesores",schema = "public")
public class Professor {

    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false,unique = true)
    private Long id;

    @Getter @Setter
    @Column(name = "nome",nullable = false,unique = false,length = 20)
    private String nome;

    @Getter @Setter
    @JoinColumn(name = "alunos",nullable = false)
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinTable(name = "Professor_tem_alunos",joinColumns = {@JoinColumn(name = "id_Profesor")},inverseJoinColumns = {@JoinColumn(name = "id_aluno")})
    private List<Aluno> alunos;

}

