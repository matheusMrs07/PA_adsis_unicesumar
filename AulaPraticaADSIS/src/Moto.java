
public class Moto extends Veiculo implements Combustivel{

    public double qtd_combustivel;
 
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
    public void abastecer(double qtd){
        System.out.println("Colocando gasolina");
        qtd_combustivel += qtd;
    }
}
