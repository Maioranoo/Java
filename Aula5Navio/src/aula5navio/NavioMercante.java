package aula5navio;

/**
 *
 * @author unifjmaiorano
 */
public class NavioMercante extends Navio {
    
    protected double capacidadecarga,carga;

    public NavioMercante() {
    }

    public NavioMercante(double capacidadecarga, double carga, String nome, Integer tripulantes) {
        super(nome, tripulantes);
        this.capacidadecarga = capacidadecarga;
        this.carga = carga;
    }

    public double getCapacidadecarga() {
        return capacidadecarga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCapacidadecarga(double capacidadecarga) {
        this.capacidadecarga = capacidadecarga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
    public void carregameno(){
        System.out.println("--------------------");
        System.out.println("------Navio Mercante------");
        exibirInfoGeral();
        System.out.println("Capacidade de carga: "+getCapacidadecarga());
        System.out.println("Carga: "+getCarga());
    }
}
