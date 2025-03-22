package model;

public abstract class Pessoa {
    protected String nome;
    protected String cpf;
    protected int idade;
    protected String genero;

    public Pessoa(String nome, String cpf, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public Pessoa(String nome, String cpf, int idade, String genero){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.genero = genero;
    }

    public abstract void exibirDetalhes();

}
