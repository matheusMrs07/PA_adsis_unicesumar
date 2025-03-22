package service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.*;

public class gestorAcademico {
    Map<String, Aluno> alunos = new HashMap<>();
    List<Professor> professores = new ArrayList<>();
    Map<String, Curso> cursos = new HashMap<>();

    public void adicionarProfessor(Professor p){
        professores.add(p);
    }

    public void adicionarAluno(Aluno a){
        alunos.put(a.getMatricula(), a);
    }

    private String gerarMatricula(){
        return ""+(alunos.size()+1);
    }

    public void adicionarAluno(String nome, String cpf, int idade){
        String matricula = gerarMatricula();
        Aluno a = new Aluno(nome, cpf, idade, matricula);
        alunos.put(matricula, a);
    }

    public void adicionarAluno(String nome, String cpf, int idade, String matricula){
        Aluno a = new Aluno(nome, cpf, idade, matricula);
        alunos.put(matricula, a);
    }

    public void adicionarCurso(Curso c){
        cursos.put(c.getCodigo(), c);
    }

    public void matricularAlunoCurso(Aluno a, Curso c){
        a.matricularEmCurso(c);
    }
}
