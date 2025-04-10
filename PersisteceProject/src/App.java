import dao.PessoaDAO;
import models.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
       
        Pessoa p = new Pessoa("Eduarda Souza", 30, "0000005");

        p.setId(3);

        PessoaDAO pessoaDao = new PessoaDAO();

        pessoaDao.delete(p);

        // pessoaDao.read();
    }
}
