package com.adsis.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name="adsis_enderecos")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="logradouro", nullable=false)
    private String rua;

    @Column(nullable=false)
    private String numero;

    @Column(nullable=false)
    private String bairro;

    @Column(nullable=false)
    private String cidade;

    @Column(nullable=false)
    private String estado;

    @Column(nullable=false)
    private String cep;

    private String complemento;

    @ManyToOne
    // @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;


    public Endereco(){
        
    }

    public Endereco(String rua, String numero, String bairro, String cidade, String estado, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }


}
