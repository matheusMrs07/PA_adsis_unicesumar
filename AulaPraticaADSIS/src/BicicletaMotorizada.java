public class BicicletaMotorizada extends Bicicleta implements Combustivel{

    public BicicletaMotorizada(String marca, String modelo, int ano) {
        super(marca,modelo, ano);
    }

    @Override
    public void abastecer(){
        System.out.println("Colocando Gasolina");
    }
}
