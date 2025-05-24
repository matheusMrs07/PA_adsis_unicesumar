package com.adsis.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="adsis_grupos")
public class Grupo {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private UUID id;

    @Column(nullable=false)
    private String nome;
    private String descricao;

    @ManyToMany
    @JoinTable(
        name="adsis_grupo_usuario",
        joinColumns=@JoinColumn(name="grupo_id"),
        inverseJoinColumns=@JoinColumn(name="usuario_id")
    )
    private List<Usuario> usuarios = new ArrayList<>();

    public void addUsuario(Usuario u){
        usuarios.add(u);
    }

}   
