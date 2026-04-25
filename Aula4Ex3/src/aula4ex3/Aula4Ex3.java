package aula4ex3;
import java.util.ArrayList;

public class Aula4Ex3 {
    
    public static void main(String[] args) {
        ArrayList<String>nomes1=new ArrayList<>();
        
        nomes1.add("Joao");
        nomes1.add("dena");
        nomes1.add("taty");
        nomes1.add("duda");
        
        //ArrayList<String>nomes2=new ArrayList<>();
        
        //solucao de copia por construtor
         ArrayList<String>nomes2=new ArrayList<>(nomes1);
        
        //nomes2=nomes1; //nao funciona
        
        nomes1.set(0, "jao");
        
        System.out.println("Nomes 1:");
        System.out.println(nomes1);
        System.out.println("Nomes 2:");
        System.out.println(nomes2);
    }
    
}
