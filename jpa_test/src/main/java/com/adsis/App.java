package com.adsis;

import com.adsis.models.Endereco;
import com.adsis.models.Grupo;
import com.adsis.models.Pessoa;
import com.adsis.models.Usuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("adsis_persistence");

        EntityManager em = emf.createEntityManager();
        Pessoa p = new Pessoa("João 2", 22, "00001", "aaba@aaa.com");
        Endereco e = new Endereco();
        Usuario u = new Usuario();
        Grupo g = new Grupo();

        g.setNome("GRupo 1");
        g.setDescricao("aaaaaaaaaa");

        p.setUsuario(u);

        u.setUsername("teste1123");
        u.setSenha("senha");
        u.setPessoa(p);

        e.setEstado("PR");
        e.setCidade("PG");
        e.setBairro("CEntro");
        e.setRua("rua A");
        e.setNumero("10");
        e.setCep("0000000");

        e.setPessoa(p);

        u.addGrupo(g);
        g.addUsuario(u);


        em.getTransaction().begin();
        em.persist(u);
        em.persist(p);
        em.persist(e);
        em.persist(g);
        em.getTransaction().commit();


        System.out.println("Conectado com sucesso!");

        em.close();
        emf.close();

    }
}
