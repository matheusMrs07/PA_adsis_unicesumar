
import model.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Aluno a1 = new Aluno("Joao", "000000", 25, "1234");

        a1.exibirDetalhes();


        Professor p1 = new Professor("José", "111111", 30, "Programação Frontend", 1000.0);
        p1.exibirDetalhes();
    }
}
