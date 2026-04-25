package com.mycompany.aula02ex01;

import java.util.Scanner;

public class TestePessoa {
    public static void main(String[]args){
        Scanner teclado= new Scanner(System.in);
        
        String nomeLocal, cpfLocal;
        int idadeLocal;
        
        //criar o primerio objeto da classe pessoa
        Pessoa p1= new Pessoa();
        
        System.out.println("Informe o nome de p1: ");
        nomeLocal=teclado.nextLine();
        
        System.out.println("Informe o cpf da p1: ");
        cpfLocal=teclado.nextLine();
        
        System.out.println("Informe a idade da p1:");
        idadeLocal=teclado.nextInt();
        
        p1.setNome(nomeLocal);
        p1.setCpf(cpfLocal);
        p1.setIdade(idadeLocal);
        
        System.out.println("-----Recebimento de dados da p1-----");
        System.out.println("Nome: "+p1.getNome());
        System.out.println("CPF: "+p1.getCpf());
        System.out.println("Idade: "+p1.getIdade());
        System.out.println("\n");
        
        Pessoa p2= new Pessoa();
        teclado.nextLine();
        
        System.out.println("Informe o nome de p2: ");
        nomeLocal=teclado.nextLine();
        
        System.out.println("Informe o cpf da p2: ");
        cpfLocal=teclado.nextLine();
        
        System.out.println("Informe a idade da p2:");
        idadeLocal=teclado.nextInt();
        
        p2.setNome(nomeLocal);
        p2.setCpf(cpfLocal);
        p2.setIdade(idadeLocal);
        
        System.out.println("-----Recebimentos de dados da p2-----");
        System.out.println("Nome: "+p2.getNome());
        System.out.println("CPF: "+p2.getCpf());
        System.out.println("Idade: "+p2.getIdade());
        System.out.println("\n");
        
        
        Pessoa p3= new Pessoa();
        teclado.nextLine();
        
        System.out.println("Informe o nome de p3: ");
        nomeLocal=teclado.nextLine();
        
        System.out.println("Informe o cpf da p3: ");
        cpfLocal=teclado.nextLine();
        
        System.out.println("Informe a idade da p3:");
        idadeLocal=teclado.nextInt();
        
        p3.setNome(nomeLocal);
        p3.setCpf(cpfLocal);
        p3.setIdade(idadeLocal);
        
        System.out.println("-----Recebimento de dados da p3-----");
        System.out.println("Nome: "+p3.getNome());
        System.out.println("CPF: "+p3.getCpf());
        System.out.println("Idade: "+p3.getIdade());
        System.out.println("\n");

        //limpeza de buffer de memoria(Ler um string depois de ler um numero)
        
        //teclado.nextLine();




        
        
        
    }
}
