package aula7ex8;

/**
 *
 * @author unifjmaiorano
 */
public class Aula7Ex8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Carro carro= new Carro(10,280);
       
       try{
           carro.frear(9);
           System.out.println(carro);
           carro.frear(2);
           System.out.println(carro);
       }catch(VelocidadeException e){
           System.out.println(e);
       }
        System.out.println(carro);
        try{
            carro.acelerar(100);
            System.out.println(carro);
            carro.acelerar(200);
            System.out.println(carro);
        }catch(VelocidadeException e){
            System.out.println(e);
        }
        System.out.println(carro);
    }
}
