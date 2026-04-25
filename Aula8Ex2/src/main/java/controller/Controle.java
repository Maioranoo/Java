package controller;
import model.Soma;
import view.Janela;

/**
 *
 * @author unifjmaiorano
 */
public class Controle {
    private Janela view;

    public Controle(Janela view) {
        this.view = view;
    }
    
    public void controleLimpar(){
        view.getTxt_nro1().setText("");
        view.getTxt_nro2().setText("");
        view.getTxt_resultado().setText("");
    }
    
    public void controleSomar(){
        double n1=Double.parseDouble(view.getTxt_nro1().getText());
        double n2=Double.parseDouble(view.getTxt_nro2().getText());
        Soma s = new Soma();
        double r= s.calcular(n1,n2);
        view.getTxt_resultado().setText(String.valueOf(r));
    }
}
