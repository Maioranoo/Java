package aula5navio;

import java.util.Scanner;

/**
 *
 * @author unifjmaiorano
 */
public class TesteNavio {
    
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String nomeL;
        Integer numTripulantesL,numCanhoesL,numAvioesL;
        Double blindagemL,ataqueL,capacidadeDeCargaL,cargaL;
        
        System.out.println("Informe Nome: ");
        nomeL=teclado.nextLine();
        System.out.println("Informe o numero de tripulantes: ");
        numTripulantesL=teclado.nextInt();
        Navio n1=new Navio(nomeL,numTripulantesL);
        n1.exibirInfoGeral();
        
        System.out.println("Informe Nome: ");
        nomeL=teclado.nextLine();
        System.out.println("Informe o numero de tripulantes: ");
        numTripulantesL=teclado.nextInt();
        System.out.println("Informe a capacidade maxima de carga: ");
        capacidadeDeCargaL=teclado.nextDouble();
        System.out.println("Informe o tamanho da carga: ");
        cargaL=teclado.nextDouble();
        NavioMercante n2= new NavioMercante(capacidadeDeCargaL,cargaL,nomeL,numTripulantesL);
        n2.exibirInfoGeral();
        n2.carregameno();
        
        System.out.println("Informe Nome: ");
        nomeL=teclado.nextLine();
        System.out.println("Informe o numero de tripulantes: ");
        numTripulantesL=teclado.nextInt();
        System.out.println("Informe a quantidade de blindagem: ");
        blindagemL=teclado.nextDouble();
        System.out.println("Informe o valor de ataque: ");
        ataqueL=teclado.nextDouble();
        NavioDeGuerra n3= new NavioDeGuerra(blindagemL,ataqueL,nomeL,numTripulantesL);
        n3.exibirInfoGeral();
        n3.exibirArmas();
        n3.poderDeFogo();
        
        System.out.println("Informe Nome: ");
        nomeL=teclado.nextLine();
        System.out.println("Informe o numero de tripulantes: ");
        numTripulantesL=teclado.nextInt();
        System.out.println("Informe o numero de canhoes: ");
        numCanhoesL=teclado.nextInt();
        Cruzador n4=new Cruzador(numCanhoesL,blindagemL,ataqueL,nomeL,numTripulantesL);
        n4.exibirInfoGeral();
        n4.exibirArmas();
        n4.poderDeFogo();
        
        System.out.println("Informe Nome: ");
        nomeL=teclado.nextLine();
        System.out.println("Informe o numero de tripulantes: ");
        numTripulantesL=teclado.nextInt();
        System.out.println("Informe o numero de avioes: ");
        numAvioesL=teclado.nextInt();
        PortaAvioes n5= new PortaAvioes(numAvioesL,blindagemL,ataqueL,nomeL,numTripulantesL);
        n5.exibirInfoGeral();
        n5.exibirArmas();
        n5.poderDeFogo();
        
    }
}
