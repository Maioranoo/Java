package calculararea;

/**
 *
 * @author unifjmaiorano
 */
public class Calculararea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Area quadrado: "+Area.calculararea(7));
        
        System.out.println("Area retangulo: "+Area.calculararea(20, 95));
        
        System.out.println("Area retangulo: %.2f%%n"+Area.calculararea(5.2, 9.3));;
        
    }
    
}
