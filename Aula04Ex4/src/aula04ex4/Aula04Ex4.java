package aula04ex4;

import java.util.ArrayList;


public class Aula04Ex4 {


    public static void main(String[] args) {
        ArrayList<ContaCorrente>contas=new ArrayList<>();
        
        for(int i=0; i<10;i++){
            contas.add(new ContaCorrente(1000));
        }
        
        for (int i=0; i<contas.size();i++){
            ContaCorrente conta=contas.get(i);

            conta.depositar(500);
            conta.sacar(200);
            conta.setSaldo(conta.getSaldo()+200);
            System.out.println("Conta"+(i+1)+"Saldo final:R$: "+conta.getSaldo());
        }
    }
}
