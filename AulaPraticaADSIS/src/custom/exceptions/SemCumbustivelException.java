package custom.exceptions;

public class SemCumbustivelException extends Exception {
    public SemCumbustivelException(String message){
        super(message);
    }

    public SemCumbustivelException(){
        super("Erro: Sem Combustível! Abasteça para acelerar! ");
    }
}
