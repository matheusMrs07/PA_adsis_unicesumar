package custom.exceptions;

public class ItemNaoEncontradoException extends Exception {
    public ItemNaoEncontradoException(String message){
        super(message);
    }
    public ItemNaoEncontradoException(){
        super("Item procurado não existe!");
    }

}
