package custom.exceptions;

public class TanqueCheioException extends Exception {
    public  TanqueCheioException(String message){
        super(message);
    }

    public  TanqueCheioException(){
        super("Erro: Capacidade do tanque excedida!");
    }
}
