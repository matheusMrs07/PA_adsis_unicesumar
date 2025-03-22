import java.util.Map;
import java.util.TreeMap;
 
public class App {
    public static void main(String[] args) throws Exception {

        Map<String, Pessoa> pessoasMap = new TreeMap<>();

        Pessoa pessoa1 = new Pessoa("000", "João", 25);
        pessoasMap.put(pessoa1.cpf, pessoa1);

        Pessoa pessoa2 = new Pessoa("101", "Maria", 35);
        pessoasMap.put(pessoa2.cpf, pessoa2);

        Pessoa pessoa3 = new Pessoa("102", "Jose", 55);
        pessoasMap.put(pessoa3.cpf, pessoa3);
        
        Pessoa pessoa4 = new Pessoa("003", "Pedro", 21);
        pessoasMap.put(pessoa4.cpf, pessoa4);

        pessoasMap.get("000").exibirInfos();

        System.out.println(pessoa1);
        
        // System.out.println(Carro.velocidadeMaxima);
        // Carro.buzina();


        // Moto moto = new Moto("Honda", "bis", 2012);
        // moto.acelerar();
        // moto.exibirDetalhes();
        // System.out.println("----------------");
        // uno.exibirDetalhes();
        // uno.acelerar();
        // System.out.println("----------------");

        // Bicicleta bicicleta = new Bicicleta("Monarc", "Barra Forte", 1990);
        // bicicleta.acelerar();
        // bicicleta.exibirDetalhes();


    }
}
