package dao;

import feitv.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Usuario;

public class UsuarioDAO {

    Connection conn;

    public UsuarioDAO() {
        conn = Conexao.conectar();
    }

    public void cadastrarUsuario(Usuario u) {

        try {

            String sql = "INSERT INTO usuario(nome,usuario,senha) VALUES (?,?,?)";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, u.getNome());
            stmt.setString(2, u.getUsuario());
            stmt.setString(3, u.getSenha());

            stmt.execute();

            System.out.println("Usuario cadastrado!");

        } catch (SQLException e) {

            System.out.println("Erro: " + e);
        }
    }

    public boolean login(String usuario, String senha) {

        try {

            String sql = "SELECT * FROM usuario WHERE usuario=? AND senha=?";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, usuario);
            stmt.setString(2, senha);

            ResultSet rs = stmt.executeQuery();

            return rs.next();

        } catch (SQLException e) {

            System.out.println("Erro: " + e);

            return false;
        }
    }
}