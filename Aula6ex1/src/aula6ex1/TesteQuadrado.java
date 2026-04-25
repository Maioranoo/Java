package aula6ex1;

import java.util.Scanner;

/**
 *
 * @author unifjmaiorano
 */
public class TesteQuadrado {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        
        int xInt;
        double xDouble;
        
        Quadrado q=new Quadrado();
        
        System.out.println("Digite um numero inteiro:");
        xInt=teclado.nextInt();
        
        System.out.println("O valor do quadrado eh: "+q.square(xInt));
        
        System.out.println("Digite um numero real:");
        xDouble=teclado.nextDouble();
        
        System.out.println("O valor do quadrado eh: "+q.square(xDouble));
    }
    
}
