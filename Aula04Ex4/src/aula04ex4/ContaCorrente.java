package aula04ex4;

/**
 *
 * @author unifjmaiorano
 */
public class ContaCorrente {
    private double saldo;

    public ContaCorrente() {
    }

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double valor){
        if(valor>0){
        saldo=+valor;
        }
    }

    @Override
    public String toString() {
        return "ContaCorrente{" + "saldo=" + saldo + '}';
    }
    
    public void sacar(double valor){
        if(valor>0 && valor<= saldo){
        saldo-=valor;
        }
    }
    
}
