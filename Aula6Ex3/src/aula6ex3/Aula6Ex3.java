package aula6ex3;

import java.util.Scanner;

/**
 *
 * @author unifjmaiorano
 */
public class Aula6Ex3 {
    
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        
        String tipoL;
        double comprimentoL,larguraL,raioL;
        
        Formas f=null;
        
        System.out.println("Informe o tipo de figura(Circulo ou Retangulo)");
        tipoL=teclado.nextLine();
        
        if(tipoL.equalsIgnoreCase("Circulo")){
            System.out.println("Informe o raio: ");
            raioL=teclado.nextDouble();
            f = new Circulo(raioL,"Circulo");
        }else{
            System.out.println("Informe o comprimento: ");
            comprimentoL=teclado.nextDouble();
            System.out.println("Informe o largura: ");
            larguraL=teclado.nextDouble();
            f = new Retangulo(comprimentoL,larguraL,"Retangulo");
        }
        f.print();
    }
}
