package dao;

import feitv.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VideoDAO {

    Connection conn;

    public VideoDAO() {

        conn = Conexao.conectar();
    }

    public ResultSet buscarVideos(String nome){

        try{

            String sql = "SELECT * FROM video WHERE titulo ILIKE ?";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, "%" + nome + "%");

            ResultSet rs = stmt.executeQuery();

            return rs;

        }catch(SQLException e){

            System.out.println(e);

            return null;
        }
    }

    public void curtirVideo(int id){

        try{

            String sql = "UPDATE video SET curtidas = curtidas + 1 WHERE id_video=?";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, id);

            stmt.execute();

        }catch(SQLException e){

            System.out.println(e);
        }
    }

    public void descurtirVideo(int id){

        try{

            String sql = "UPDATE video SET curtidas = curtidas - 1 WHERE id_video=?";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, id);

            stmt.execute();

        }catch(Exception e){

            System.out.println(e);
        }
    }
}