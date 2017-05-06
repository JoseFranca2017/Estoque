package br.com.sistema.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    public static Connection getConnection() {
        try {

			Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/estoque", "root", "6612");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
