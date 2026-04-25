package aula5navio;

import static java.lang.Math.sqrt;

/**
 *
 * @author unifjmaiorano
 */
public class Cruzador extends NavioDeGuerra {
    protected double numCanhoes;

    public Cruzador() {
    }
    
    public Cruzador(double numCanhoes, double blindagem, double ataque, String nome, Integer tripulantes) {
        super(blindagem, ataque, nome, tripulantes);
        this.numCanhoes = numCanhoes;
    }
    

    public double getNumCanhoes() {
        return numCanhoes;
    }

    public void setNumCanhoes(double numCanhoes) {
        this.numCanhoes = numCanhoes;
    }
    
     public void poderDeFogo(){
        System.out.println("--------------------");
        System.out.println("------Navio Cruzador------");
        System.out.println(ataque*sqrt(numCanhoes));
     }
}
