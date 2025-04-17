package com.adsis;

import com.adsis.models.Endereco;
import com.adsis.models.Pessoa;

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

        e.setBairro("CEntro");
        e.setRua("rua A");

        e.setPessoa(p);

        em.getTransaction().begin();

        em.persist(p);
        em.persist(e);
        em.getTransaction().commit();


        System.out.println("Conectado com sucesso!");

        em.close();
        emf.close();

    }
}
