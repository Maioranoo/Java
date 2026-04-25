package aula7ex1;

import java.util.Scanner;

/**
 *
 * @author UNIFJMAIORANO
 */
public class Aula7Ex1 {

    public static void main(String[] args) {
        
        
        
        Scanner teclado= new Scanner(System.in);
        int nro;
        
        while(true){
            
            try
        {
            System.out.println("Digite um numero:");
            nro=teclado.nextInt();

            if(nro%2==1){
                throw new IMPAR("O numero eh impar!");
            }

        }
        catch(RuntimeException e)
        {
            e.printStackTrace();
        }

        System.out.println("Continua codigo!");
        }
    }
}
        
        
        
