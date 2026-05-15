package dao;

import feitv.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ListaDAO {

    Connection conn;

    public ListaDAO() {

        conn = Conexao.conectar();
    }

    public void criarLista(String nome, int usuario_id){

        try{

            String sql = "INSERT INTO lista_reproducao(nome, usuario_id) VALUES (?,?)";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, nome);
            stmt.setInt(2, usuario_id);

            stmt.execute();

        }catch(SQLException e){

            System.out.println(e);
        }
    }
    
    public boolean editarListaPorNome(String nomeAtual, String novoNome){

    try{

        String sql = "UPDATE lista_reproducao SET nome=? WHERE nome=?";

        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setString(1, novoNome);
        stmt.setString(2, nomeAtual);

        int linhas = stmt.executeUpdate();

        return linhas > 0;

    }catch(SQLException e){

        System.out.println(e);

        return false;
    }
}
    
    public boolean excluirListaPorNome(String nome){

    try{

        String sql1 = """

        DELETE FROM lista_video

        WHERE lista_id =

        (SELECT id_lista FROM lista_reproducao WHERE nome=?)

        """;

        PreparedStatement stmt1 = conn.prepareStatement(sql1);

        stmt1.setString(1, nome);

        stmt1.execute();

        String sql2 = "DELETE FROM lista_reproducao WHERE nome=?";

        PreparedStatement stmt2 = conn.prepareStatement(sql2);

        stmt2.setString(1, nome);

        int linhas = stmt2.executeUpdate();

        return linhas > 0;

    }catch(SQLException e){

        System.out.println(e);

        return false;
    }
}
    
    public boolean adicionarVideoPorNome(String nomeLista, int video_id){

    try{

        String sql = """

        INSERT INTO lista_video(lista_id, video_id)

        VALUES(

            (SELECT id_lista FROM lista_reproducao WHERE nome=?),

            ?

        )

        """;

        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setString(1, nomeLista);

        stmt.setInt(2, video_id);

        int linhas = stmt.executeUpdate();

        return linhas > 0;

    }catch(SQLException e){

        System.out.println(e);

        return false;
    }
}
    
    public boolean removerVideoPorNome(String nomeLista, int video_id){

    try{

        String sql = """

        DELETE FROM lista_video

        WHERE lista_id =

        (SELECT id_lista FROM lista_reproducao WHERE nome=?)

        AND video_id=?

        """;

        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setString(1, nomeLista);

        stmt.setInt(2, video_id);

        int linhas = stmt.executeUpdate();

        return linhas > 0;

    }catch(SQLException e){

        System.out.println(e);

        return false;
    }
}

   public ResultSet listarListas(){

        try{

            String sql = "SELECT * FROM lista_reproducao";

            PreparedStatement stmt = conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            return rs;

        }catch(SQLException e){

            System.out.println(e);

            return null;
        }
    }
    
    public boolean listaExiste(String nome){

    try{

        String sql = "SELECT * FROM lista_reproducao WHERE nome=?";

        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setString(1, nome);

        ResultSet rs = stmt.executeQuery();

        return rs.next();

    }catch(SQLException e){

        System.out.println(e);

        return false;
    }
}
    
    public ResultSet listarVideosDaLista(String nomeLista){

    try{

        String sql = """

        SELECT video.*

        FROM video

        INNER JOIN lista_video
        ON video.id_video = lista_video.video_id

        INNER JOIN lista_reproducao
        ON lista_reproducao.id_lista = lista_video.lista_id

        WHERE lista_reproducao.nome=?

        """;

        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setString(1, nomeLista);

        ResultSet rs = stmt.executeQuery();

        return rs;

    }catch(SQLException e){

        System.out.println(e);

        return null;
    }
}
    
}