
public class Moto extends Veiculo implements Combustivel{
 
    public Moto(String marca, String modelo, int ano){
        super(marca, modelo, ano);
        this.tipo = "Automóvel";    
    }


    public void exibirDetalhes(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Ano: "+ ano);
    }

    @Override
    public void acelerar(){
        System.out.println("Acelerando");
    }
    
    @Override
    public void abastecer(){
        System.out.println("Colocando gasolina");
    }
}
