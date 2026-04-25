package agenda;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

    
    public static void main(String[] args) {
      System.out.println("--------EXERCICIO--------");
       
       Scanner input= new Scanner(System.in);
        
       ArrayList <Pessoa> agenda=new ArrayList<>();
       
       agenda.add(new Pessoa("Dena","(11)1111-1111"));
       
       System.out.println(agenda);
       
       while(true){
           System.out.println("Entre com uma das seguintes opcoes: ");
           System.out.println("--------Nova entrada--------");
           System.out.println("n[Nova entrada]");
           System.out.println("d[Apaga registro da agenda]");
           System.out.println("p[Imprimi toda a agenda]");
           System.out.println("q[Sai do programa]");
           
           String opcao=input.next();
           
           if(opcao.equalsIgnoreCase("n")){
               System.out.println("Digite o nome");
               String nome=input.next();
               System.out.println("Digite o telefone");
               String telefone=input.next();
               agenda.add(new Pessoa(nome,telefone));
               System.out.println("Contato armazenado com sucesso!");
               System.out.println("");
               
           }
           else if(opcao.equalsIgnoreCase("d")){
               System.out.println("Digite o nome para ser deletado: ");
               String nome=input.next();
               for(Pessoa contato:agenda){
                   if(nome.equalsIgnoreCase(contato.getNome())){
                       agenda.remove(contato);
                       System.out.println("Contato removido da agenda com sucesso!");
                       break;
                   }
               }
           }
           else if(opcao.equalsIgnoreCase("p")){
               System.out.println("--------");
               for(Pessoa contato: agenda){
                   System.out.println(contato);
               }
           }
           else if(opcao.equalsIgnoreCase("q")){
               break;
           }
               
           else
               System.out.print("Escolha invalida!");
       }
        System.out.println("Agenda finalizada com sucesso!");
    }
}
