
public class Carro extends Veiculo implements Combustivel {
    private String chassi;
    static final int velocidadeMaxima = 200;

    Carro(String marca, String modelo, int ano, String chassi){
        super(marca, modelo, ano);
        this.chassi = chassi;
        this.tipo = "Automóvel";

    }

    Carro(String marca, String modelo){
        super(marca, modelo);
        this.tipo = "Automóvel";
    }

    public Carro() {
        super();
        this.tipo = "Automóvel";
    }

    public Carro(Carro car){
        super(car.marca, car.modelo, car.ano);
        this.tipo = "Automóvel";
    }


    @Override
    public void acelerar(){
        System.out.println("Acelerando");
    }

    @Override
    public void abastecer(){
        System.out.println("Colocando gasolina");
    }

    public void getChassi(){
        System.out.println("Chassi: "+ this.chassi);
    }

    static void buzina(){
        System.out.println("bi bi bi");
    }

}

