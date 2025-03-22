public class CarroEsportivo extends Carro{
    int velocidadeMaxima;

    public CarroEsportivo(String marca, String modelo, int ano, int velocidadeMaxima) {
        super(marca, modelo, ano);
        this.velocidadeMaxima = velocidadeMaxima;
    }

    @Override
    public void acelerar(){
        System.out.println("Acelerando Muuuinto ....");
    }
    
}
