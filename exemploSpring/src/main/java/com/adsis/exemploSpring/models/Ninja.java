package com.adsis.exemploSpring.models;

import com.adsis.exemploSpring.DTOs.NinjaDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_ninjas")
public class Ninja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false)
    String nome;

    int idade;
    String vila;
    String cla;

    @ManyToOne
    @JoinColumn(name = "missao_id")
    Missao missao;

    public Ninja(NinjaDTO ninja) {
        this.id = ninja.id();
        this.idade = ninja.idade();
        this.nome = ninja.nome();
        this.cla = ninja.cla();
        this.vila = ninja.vila();
    }

}
