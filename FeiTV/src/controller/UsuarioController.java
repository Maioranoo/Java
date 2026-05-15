package controller;

import dao.UsuarioDAO;
import model.Usuario;

public class UsuarioController {

    UsuarioDAO dao = new UsuarioDAO();

    public void cadastrarUsuario(Usuario u){

        dao.cadastrarUsuario(u);
    }

    public boolean login(String usuario, String senha){

        return dao.login(usuario, senha);
    }
}