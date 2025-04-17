package com.adsis.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;
    
    String nome;
    int idade;
    String cpf;
    String email;

    @OneToMany(mappedBy="pessoa")
    List<Endereco> endereco;

    public Pessoa(String nome, int idade, String cpf, String email){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.email = email;
    }
}
