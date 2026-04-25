package aula5navio;

/**
 *
 * @author unifjmaiorano
 */
public class NavioDeGuerra extends Navio {
    
    protected double blindagem, ataque;

    public NavioDeGuerra() {
    }

    public NavioDeGuerra(double blindagem, double ataque, String nome, Integer tripulantes) {
        super(nome, tripulantes);
        this.blindagem = blindagem;
        this.ataque = ataque;
    }

    public double getBlindagem() {
        return blindagem;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setBlindagem(double blindagem) {
        this.blindagem = blindagem;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }
    
    
     public void poderDeFogo(){
         System.out.println("Poder de fogo: "+getAtaque());
     }
     
    public void exibirArmas(){
        System.out.println("--------------------");
        System.out.println("------Navio de Guerra------");
        exibirInfoGeral();
        System.out.println("Blindagem: "+getBlindagem());
        poderDeFogo();
    }
}
