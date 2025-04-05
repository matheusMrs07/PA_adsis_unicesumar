import custom.exceptions.SemCumbustivelException;
import custom.exceptions.TanqueCheioException;

public class Carro extends Veiculo implements Combustivel {
    private String chassi;
    static final int velocidadeMaxima = 200;
    public double qtd_combustivel = 0.0;
    public double tam_tanque;


    Carro(String marca, String modelo, int ano, String chassi){
        super(marca, modelo, ano);
        this.chassi = chassi;
        this.tipo = "Automóvel";

    }
    Carro(String marca, String modelo, int ano, String chassi, double tam_tanque){
        super(marca, modelo, ano);
        this.chassi = chassi;
        this.tipo = "Automóvel";
        this.tam_tanque = tam_tanque;

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
    public void acelerar() throws SemCumbustivelException{
        if(qtd_combustivel < 1.0){
            throw new SemCumbustivelException();
        }
        System.out.println("Acelerando");

        qtd_combustivel -= 1.0;
    }

    @Override
    public void abastecer(double qtd) throws TanqueCheioException{
        if(tam_tanque < qtd_combustivel + qtd){
            System.out.println("SSem combustivel");
        }
        qtd_combustivel += qtd;
        System.out.println("Colocando gasolina");
    }

    public void getChassi(){
        System.out.println("Chassi: "+ this.chassi);
    }

    static void buzina(){
        System.out.println("bi bi bi");
    }

}

