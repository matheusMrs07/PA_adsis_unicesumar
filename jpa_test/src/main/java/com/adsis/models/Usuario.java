package com.adsis.models;

import java.util.ArrayList;
import java.util.Date;
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
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="adsis_usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private UUID id;

    @Column(nullable=false, unique=true)
    private String username;

    @Column(nullable=false)
    private String senha;

    private Date ultimo_acesso = new Date();

    @OneToOne
    @JoinColumn(name="pessoa_id")
    Pessoa pessoa;

    @ManyToMany
    @JoinTable(
        name="adsis_grupo_usuario",
        joinColumns=@JoinColumn(name="usuario_id"),
        inverseJoinColumns=@JoinColumn(name="grupo_id")
    )
    private List<Grupo> grupos = new ArrayList<>();

    public void addGrupo(Grupo g){
        grupos.add(g);
    }
}
