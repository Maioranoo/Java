package aula6ex3;

/**
 *
 * @author unifjmaiorano
 */
public class Retangulo extends Formas{
    
    private double comprimento,largura;

    public Retangulo() {
    }

    public Retangulo(double comprimento, double largura, String tipo) {
        super(tipo);
        this.comprimento = comprimento;
        this.largura = largura;
    }
    
    @Override
    
    public double perimetro(){
        return 2*comprimento + 2*largura;
    }
    
    @Override
    public void print(){
            System.out.println("===RETANGULO===");
            System.out.println("COMPRIMENTO: "+comprimento);
            System.out.println("LARGURA: "+largura);
            System.out.println("PERIMETRO: "+perimetro());
    }
}