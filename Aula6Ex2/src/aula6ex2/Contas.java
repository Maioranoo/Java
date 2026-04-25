package aula6ex2;

import java.util.Scanner;

/**
 *
 * @author unifjmaiorano
 */
public class Contas {
    
    public static void main(String[] args) {
        OperacaoMatematica operacao=null;
        
        Scanner entrada = new Scanner(System.in);
        String op=entrada.nextLine();
        
        if(op.equals("soma"))
            operacao=new Adicao();
        
        else if(op.equals("subtracao"))
            operacao=new Subtracao();
        
        else if(op.equals("multiplicacao"))
            operacao=new Multiplicacao();
        
        else if(op.equals("divisao"))
            operacao= new Divisao();
        
        System.out.println("Resultado da conta: "+ operacao.calcular(5, 9));
    }
}

