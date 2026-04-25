package aula5ex2;

/**
 *
 * @author unifjmaiorano
 */
public class Vereador extends Politico {
    private String municipio;

    public Vereador() {
    }

    public Vereador(String municipio, String nome, String partido, String estado, String funcao) {
        super(nome, partido, estado, funcao);
        this.municipio = municipio;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    
    public void apresentacao(){
        System.out.println("--------------------");
        System.out.println("------VEREADOR------");
        System.out.println("Nome: "+getNome());
        System.out.println("Partido: "+getPartido());
        System.out.println("Munucipio: "+municipio);
        System.out.println("Estado: "+getEstado());
        System.out.println("Funcao: "+getFuncao());
    }
}
