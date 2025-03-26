
import java.util.Scanner;
import model.Curso;
import model.Professor;
import service.GestorAcademico;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        GestorAcademico gestorAcademico = new GestorAcademico();

        while (true) {
            System.out.println("=== Menu ===");
            System.out.println("1. Listar Alunos");
            System.out.println("2. Listar Cursos");
            System.out.println("3. Listar Professores");
            System.out.println("4. Cadastrar Aluno");
            System.out.println("5. Cadastrar Curso");
            System.out.println("6. Cadastrar Professor");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    gestorAcademico.listarAlunos();
                    break;
                case 2:
                    gestorAcademico.listarCursos();
                    break;

                case 3:
                    gestorAcademico.listarProfessores();
                    break;
                
                case 4:
                    System.out.println("Cadastro de Aluno");
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.println("CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.println("Idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("RA: ");
                    String matricula = scanner.nextLine();

                    System.out.println("Código do curso: ");
                    String cod_curso = scanner.nextLine();

                    gestorAcademico.adicionarAluno(nome, cpf, idade, matricula);

                    gestorAcademico.matricularAlunoCurso(matricula, cod_curso);

                    break;

                case 5:
                    System.out.print("Nome do Curso: ");
                    String nomeCurso = scanner.nextLine();
                    System.out.print("Carga Horária: ");
                    int cargaHoraria = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha
                    System.out.print("Código do Curso: ");
                    String codigoCurso = scanner.nextLine();
                    Curso novoCurso = new Curso(nomeCurso, cargaHoraria, codigoCurso);
                    gestorAcademico.adicionarCurso(novoCurso);
                    break;
                case 6:
                    System.out.print("Nome do Professor: ");
                    String nomeProfessor = scanner.nextLine();
                    System.out.print("CPF do Professor: ");
                    String cpfProfessor = scanner.nextLine();
                    System.out.print("Idade do Professor: ");
                    int idadeProfessor = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha
                    System.out.print("Matrícula do Professor: ");
                    String matriculaProfessor = scanner.nextLine();
                    System.out.print("Especialidade do Professor: ");
                    String especialidade = scanner.nextLine();
                    System.out.print("Salário do Professor: ");
                    double salario = scanner.nextDouble();
                    scanner.nextLine(); // Consumir a quebra de linha
                    Professor novoProfessor = new Professor(nomeProfessor, cpfProfessor, idadeProfessor, matriculaProfessor, especialidade, salario);
                    gestorAcademico.adicionarProfessor(novoProfessor);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                
                default:
                    throw new AssertionError();
            }

        }
        
        // GestorAcademico gestor = new GestorAcademico();

        // Aluno a1 = new Aluno("Joao", "000000", 25, "1234");

        // // a1.exibirDetalhes();


        // Professor p1 = new Professor("José", "111111", 30, "Programação Frontend", 1000.0);
        // // p1.exibirDetalhes();
        // Professor p2 = new Professor("Pedro", "111112", 32, "Python", 1000.0);
        // Professor p3 = new Professor("Antonio", "111113", 31, "Python", 1000.0);
        // Professor p4 = new Professor("Bruno", "111114", 30, "Frontend", 1000.0);
        // Professor p5 = new Professor("Bruno da Silva", "111115", 30, "C#", 1000.0);

        // Curso c1 = new Curso("Analise de Sis.", 100, "adsis");


        // gestor.adicionarProfessor(p1);
        // gestor.adicionarProfessor(p2);
        // gestor.adicionarProfessor(p3);
        // gestor.adicionarProfessor(p4);
        // gestor.adicionarProfessor(p5);
        // gestor.adicionarCurso(c1);
        // gestor.adicionarAluno(a1);
        // gestor.matricularAlunoCurso(a1, c1);

        // // gestor.listarCursos();
        // // gestor.listarAlunos();
        // // gestor.listarProfessores();

        // gestor.filtrarProf(prof -> prof.getEspecialidade().contains("Python"));


    }
}
