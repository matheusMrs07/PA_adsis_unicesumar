package model;
import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    protected String matricula;
    protected List<Curso> cursosMat = new ArrayList<>();


    public Aluno(String nome, String cpf, int idade, String matricula) {
        super(nome, cpf, idade);
        this.matricula = matricula;
    }

    public Aluno(String nome, String cpf, int idade, String genero, String matricula) {
        super(nome, cpf, idade, genero);
        this.matricula = matricula;
    }

    public void exibirDetalhes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Matrícula: "+ this.matricula);
    }

    public void matricularEmCurso(Curso curso){
        cursosMat.add(curso);
    }

    public void desmatricularEmCurso(Curso curso){
        cursosMat.remove(curso);
    }

    public String getMatricula(){
        return this.matricula;
    }
}
