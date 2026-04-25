package aula6ex3;

/**
 *
 * @author unifjmaiorano
 */
public abstract class Formas {
    private String tipo;

    public Formas() {
    }

    public Formas(String tipo) {
        this.tipo = tipo;
    }
    
    public abstract double perimetro();
    
    public abstract void print();
}
