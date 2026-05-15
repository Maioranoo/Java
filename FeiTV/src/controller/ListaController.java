package controller;

import dao.ListaDAO;
import java.sql.ResultSet;

public class ListaController {

    ListaDAO dao = new ListaDAO();

    public void criarLista(String nome){

        dao.criarLista(nome, 1);
    }

    public boolean listaExiste(String nome){

        return dao.listaExiste(nome);
    }

    public boolean editarLista(String atual, String novoNome){

        return dao.editarListaPorNome(atual, novoNome);
    }

    public boolean excluirLista(String nome){

        return dao.excluirListaPorNome(nome);
    }

    public boolean adicionarVideo(String lista, int video){

        return dao.adicionarVideoPorNome(lista, video);
    }

    public boolean removerVideo(String lista, int video){

        return dao.removerVideoPorNome(lista, video);
    }

    public ResultSet listarVideosDaLista(String lista){

        return dao.listarVideosDaLista(lista);
    }
}