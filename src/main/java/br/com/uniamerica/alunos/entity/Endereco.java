package br.com.uniamerica.alunos.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_enderecos",schema = "public")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",nullable = false)
    private Long id;

    @Getter @Setter
    @Column(name = "rua",nullable = false)
    private String rua;

    @Getter @Setter
    @Column(name = "numero",nullable = false)
    private int numero;

    @Getter @Setter
    @Column(name = "bairro",nullable = false)
    private String bairro;

    @Getter @Setter
    @Column(name = "cep",nullable = false)
    private int Cep;


}
