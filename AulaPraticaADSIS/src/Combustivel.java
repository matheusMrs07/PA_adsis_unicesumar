import custom.exceptions.TanqueCheioException;

public interface Combustivel {
    public void abastecer(double qtd) throws TanqueCheioException;
}
