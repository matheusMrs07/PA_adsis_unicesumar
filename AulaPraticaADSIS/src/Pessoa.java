import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    String cpf; 
    String nome;
    int idade;
    String[] telefones = new String[3];
    List<Veiculo> veiculos = new ArrayList<>();

    public Pessoa(String cpf, String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public Pessoa(String cpf, String nome, int idade, String[] telefones){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        for(int i=0; i<telefones.length; i++){
            this.telefones[i] = telefones[i];
        }
        
    }
    
    public void comprarVeiculo(Veiculo veiculo){
        this.veiculos.add(veiculo);
    }

    public void venderVeiculo(Veiculo veiculo){
        this.veiculos.remove(veiculo);
    }

    public void exibirVeiculos(){
        System.out.println("Veiculos: ");
        for(Veiculo vel: this.veiculos){
            vel.exibirDetalhes();
        }
    }

    public void cadastrarTelefone(String telefone){
        for(int i = 0; i<telefones.length; i++){
            if(this.telefones[i] == null){
                this.telefones[i] = telefone;
                System.out.println("Telefone Cadastrado");
                return;
            }
        }
        System.out.println("Erro: lista de telefones cheia");

    }

    public void exibirTelefones(){
        System.out.println("Telefones: ");
        for(String tel : this.telefones){
            if(tel != null){
                System.out.println(tel);
            }
        }
    }

    public void exibirInfos(){
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+ idade);
        exibirTelefones();
    }
}
