package aula5navio;

/**
 *
 * @author unifjmaiorano
 */
public class PortaAvioes extends NavioDeGuerra {
    protected  double numAvioes;

    public PortaAvioes() {
    }

    public PortaAvioes(double numAvioes, double blindagem, double ataque, String nome, Integer tripulantes) {
        super(blindagem, ataque, nome, tripulantes);
        this.numAvioes = numAvioes;
    }

    

    public double getNumAvioes() {
        return numAvioes;
    }

    public void setNumAvioes(double numAvioes) {
        this.numAvioes = numAvioes;
    }
    
    
    public void poderDeFogo(){
        System.out.println("--------------------");
        System.out.println("------Porta Avioes------");
        System.out.println(ataque*(numAvioes*numAvioes));
     }
}
