package feitv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public static Connection conectar() {

        try {

            String url = "jdbc:postgresql://localhost:5432/feitv";
            String usuario = "postgres";
            String senha = "fei";

            Connection conn = DriverManager.getConnection(url, usuario, senha);

            return conn;

        } catch (SQLException e) {

            System.out.println("Erro: " + e);

            return null;
        }
    }
}