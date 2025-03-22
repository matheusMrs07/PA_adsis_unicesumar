package model;

public class Professor extends Pessoa {
    protected String especialidade;
    private double salario;

    public Professor(String nome, String cpf, int idade, String especialidade, double salario) {
        super(nome, cpf, idade);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public Professor(String nome, String cpf, int idade, String genero, String especialidade, double salario) {
        super(nome, cpf, idade);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public void exibirDetalhes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Especialidade: "+ this.especialidade);
    }

}
