package com.adsis.factory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionFactory {
    static final String URL = "jdbc:mysql://localhost:3306/adsis";
    static final String USER = "root";
    static final String PASSWORD = "root";

    public static Connection getMySQLConnection() throws SQLException{
        Connection conexao = DriverManager.getConnection(URL, USER, PASSWORD);
        return conexao;
    }
}