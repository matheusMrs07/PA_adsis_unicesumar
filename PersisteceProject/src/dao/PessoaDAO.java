package dao;
import factory.ConectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.Pessoa;

public class PessoaDAO {

    public void create(Pessoa pessoa){
        String sql = "INSERT INTO pessoas (nome, idade, cpf) VALUES (?, ?, ?)";

        try (
            Connection conn = ConectionFactory.getMySQLConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ){
        
            stmt.setString(1, pessoa.getNome());
            stmt.setInt(2, pessoa.getIdade());
            stmt.setString(3, pessoa.getCpf());

            stmt.execute();

            System.out.println("Pessoa criada com Sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Pessoa> read(){
        String sql = "SELECT * FROM pessoas";

        List<Pessoa> pessoas = new ArrayList<>();

        try(
            Connection conn = ConectionFactory.getMySQLConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
        )
        {
            while(rs.next()){
                System.out.println("----------------------------------");
                System.out.println("Pessoa id: "+rs.getInt("id"));

                System.out.println("Nome: "+rs.getString("nome"));

                System.out.println("Idade: "+rs.getInt("idade"));

                System.out.println("CPF: "+rs.getString("cpf"));
                System.out.println("----------------------------------");

                Pessoa p = new Pessoa(
                    rs.getString("nome"), 
                    rs.getInt("idade"), 
                    rs.getString("cpf"));

                p.setId(rs.getInt("id"));
                pessoas.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pessoas;
        
    }

    public void update(Pessoa pessoa){
        String sql = "UPDATE pessoas SET nome=?, idade=?, cpf=? WHERE id=?";
        try (
            Connection conn = ConectionFactory.getMySQLConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ){
        
            stmt.setString(1, pessoa.getNome());
            stmt.setInt(2, pessoa.getIdade());
            stmt.setString(3, pessoa.getCpf());
            stmt.setInt(4, pessoa.getId());

            int update_instances = stmt.executeUpdate();

            if(update_instances == 0){
                System.out.println("Pessoa não encontrada!");
                return;
            }

            System.out.println("Pessoa Editada com Sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(Pessoa pessoa){
        String sql = "DELETE FROM pessoas WHERE id = ?";

        try (
            Connection conn = ConectionFactory.getMySQLConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
        ){
            stmt.setInt(1, pessoa.getId());
            
            int update_instances = stmt.executeUpdate();

            if(update_instances == 0){
                System.out.println("Pessoa não encontrada!");
                return;
            }

            System.out.println("Pessoa Deletada com sucesso! \nPessoas deletadas: "+update_instances);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }

}
