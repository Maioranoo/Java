package aula5ex1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author unifjmaiorano
 */
public class TesteAlunoPessoa {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        ArrayList<Aluno> turma=new ArrayList<>();
        
        String nomeL,sobrenomeL, cursoL;
        int idadeL;
        //construtor sem parametro
        turma.add(new Aluno());
        
        System.out.println("Informe Nome: ");
        nomeL=teclado.nextLine();
        System.out.println("Informe Sobrenome: ");
        sobrenomeL=teclado.nextLine();
        System.out.println("Informe Curso: ");
        cursoL=teclado.nextLine();
        System.out.println("Informe Idade: ");
        idadeL=teclado.nextInt();
        
        turma.add(new Aluno(cursoL,nomeL,sobrenomeL,idadeL));
        
        for(Aluno a: turma){
            a.print();
        }
    }
}
