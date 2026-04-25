
package aula5navio;

/**
 *
 * @author unifjmaiorano
 */
public class Navio {
    
    protected String nome;
    protected Integer tripulantes;

    public Navio() {}

    public Navio(String nome, Integer tripulantes) {
        this.nome = nome;
        this.tripulantes = tripulantes;
    }

    public String getNome() {
        return nome;
    }

    public Integer getTripulantes() {
        return tripulantes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTripulantes(Integer tripulantes) {
        this.tripulantes = tripulantes;
    }

    public void exibirInfoGeral(){
        System.out.println("--------------------");
        System.out.println("------Navio------");
        System.out.println("Nome: "+getNome());
        System.out.println("Tripulantes: "+getTripulantes());
    }

}
