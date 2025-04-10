package models;
public class Pessoa {

    private String nome;
    private int idade;
    private String cpf;
    private int id;

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public String getCpf(){
        return cpf;
    }
    
}
