package controller;

import dao.AlunoDAO;
import dao.Conexao;
import model.Aluno;
import view.LoginFrame;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author unifjmaiorano
 */
public class ControleLogin {
    private LoginFrame view;

    public ControleLogin(LoginFrame view) {
        this.view = view;
    }
    public void loginAluno(){
        Aluno aluno = new Aluno(null,
                view.getTxt_usuario().getText(),
                view.getTxt_senha().getText());
        Conexao conexao = new Conexao();
        
        try{
            Connection conn= conexao.getConnection();
            AlunoDAO dao = new AlunoDAO(conn);
            ResultSet res = dao.consultar(aluno);
            if(res.next()){
                JOptionPane.showMessageDialog(view,
                        "Login feito!",
                        "Aviso",
                        JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(view,
                        "Erro ao realizar o login!",
                        "Erro!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
                        JOptionPane.ERROR_MESSAGE);
            }
        }catch(SQLException e){}
        
    }
    
}
