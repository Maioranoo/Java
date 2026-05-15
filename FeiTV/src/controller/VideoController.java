package controller;

import dao.VideoDAO;
import java.sql.ResultSet;

public class VideoController {

    VideoDAO dao = new VideoDAO();

    public ResultSet buscarVideos(String nome){

        return dao.buscarVideos(nome);
    }

    public void curtirVideo(int id){

        dao.curtirVideo(id);
    }

    public void descurtirVideo(int id){

        dao.descurtirVideo(id);
    }
}