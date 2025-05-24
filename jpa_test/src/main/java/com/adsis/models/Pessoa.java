package com.adsis.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name="adsis_pessoas")
public class Pessoa {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable=false)
    private String nome;

    private int idade;

    @Column(nullable=false, unique=true)
    private String cpf;

    @Column(nullable=false, unique=true)
    private String email;


    @OneToMany(mappedBy="pessoa")
    private List<Endereco> enderecos = new ArrayList<>();

    @OneToOne
    @JoinColumn(name="usuario_id")
    private Usuario usuario;

    public Pessoa(String nome, int idade, String cpf, String email){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.email = email;
    }
}
