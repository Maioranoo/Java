package aula7ex6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author unifjmaiorano
 */
public class Aula7Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        ArrayList<Pessoa> pessoas= new ArrayList<>();
        for(int x=1;x<4;x++){
             while(true){
            try{
            System.out.println("Digite seu CPF: ");
            String cpf=teclado.next();
            pessoas.add(new Pessoa("Fulano"+ x,"teste",cpf,20));
            break;
        }catch(CpfException e){
            System.out.println(e);
        }
             }
        }
        for(Pessoa p:pessoas)
            System.out.println(p);
    }
}


