package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import model.Aluno;

/**
 *
 * @author unifjmaiorano
 */
public class AlunoDAO {
    private Connection conn;

    public AlunoDAO(Connection conn) {
        this.conn = conn;
    }
    
    public ResultSet consultar(Aluno aluno) throws SQLException{
//        String sql= "select * from tbalunos where usuario = '"
//                + aluno.getUsuario()+"'and senha = '"
//                + aluno.getSenha() + "'";
    String sql = "select * from tbalunos where usuario =? and senha=?";
        PreparedStatement statement= conn.prepareStatement(sql);
        statement.setString(1,aluno.getUsuario()); //*
        statement.setString(2,aluno.getSenha()); //*
        statement.execute();
        ResultSet resultado= statement.getResultSet();
        return resultado;
    }
    
}
