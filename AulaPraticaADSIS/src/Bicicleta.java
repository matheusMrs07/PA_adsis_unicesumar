public class Bicicleta extends Veiculo{
    boolean temRodinhas;

    public Bicicleta(String marca, String modelo, int ano, boolean temRodinhas) {
        super(marca, modelo, ano);
        this.temRodinhas = temRodinhas;
        this.tipo = "Tração Humana";
    }

    public Bicicleta(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        this.temRodinhas = false;
    }

    @Override
    public void acelerar(){
        System.out.println("Pedalando ....");
    }


}
