public abstract class Veiculo {

    String marca;
    String modelo;
    int ano;
    protected String tipo;

    Veiculo(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    Veiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = -1;
    }

    Veiculo(){
        this.marca = "Sem marca";
        this.modelo = "Sem modelo";
        this.ano = -1;
    }

    public void exibirDetalhes(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Ano: "+ ano);
    }

    abstract void acelerar();

    

}
