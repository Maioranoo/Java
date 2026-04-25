package aula5ex2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author unifjmaiorano
 */
public class TestePoliticos {
    
    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        ArrayList<Prefeito> cargo01=new ArrayList<>();
        ArrayList<Vereador> cargo02=new ArrayList<>();
        String nomeL,partidoL, estadoL,funcaoL,municipioL;
        
        for(int i=0;i<3;i++){
        System.out.println("Informe Nome: ");
        nomeL=teclado.nextLine();
        System.out.println("Informe o partido: ");
        partidoL=teclado.nextLine();
        System.out.println("Informe o estado: ");
        estadoL=teclado.nextLine();
        System.out.println("Informe o munucipio: ");
        municipioL=teclado.nextLine();
        System.out.println("Informe sua funcao: ");
        funcaoL=teclado.nextLine();
        cargo01.add(new Prefeito(municipioL,nomeL,partidoL,estadoL,funcaoL));
    }
        for(int i=0;i<3;i++){
        System.out.println("Informe Nome: ");
        nomeL=teclado.nextLine();
        System.out.println("Informe o partido: ");
        partidoL=teclado.nextLine();
        System.out.println("Informe o estado: ");
        estadoL=teclado.nextLine();
        System.out.println("Informe o munucipio: ");
        municipioL=teclado.nextLine();
        System.out.println("Informe sua funcao: ");
        funcaoL=teclado.nextLine();
        cargo02.add(new Vereador(municipioL,nomeL,partidoL,estadoL,funcaoL));
    }
        for(Prefeito a: cargo01){
            a.apresentacao();
        }
        for(Vereador a: cargo02){
            a.apresentacao();
        }
    }
}
