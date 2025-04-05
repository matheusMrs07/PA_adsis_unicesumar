 
public class App {
    public static void main(String[] args) throws Exception {
        Carro carro1 = new Carro("Fiat", "Uno", 2015, "aaaaaaaaa", 50.0);
        
        try {
            carro1.abastecer(3.0);
            carro1.acelerar();
            carro1.acelerar();
            carro1.acelerar();
            carro1.acelerar();
            carro1.acelerar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        

        System.out.println("Sucesso!!!");


    }
}
