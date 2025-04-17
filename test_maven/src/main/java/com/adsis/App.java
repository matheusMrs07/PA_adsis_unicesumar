package com.adsis;

import java.sql.Connection;

import com.adsis.factory.ConectionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        Connection conn = ConectionFactory.getMySQLConnection();

        conn.close();

        System.out.println("Conexão realizada com Sucesso!");
    }
}
