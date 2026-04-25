package aula5ex2;

/**
 *
 * @author unifjmaiorano
 */
public class Prefeito extends Politico {
    private String municipio;

    public Prefeito() {
    }

    public Prefeito(String municipio, String nome, String partido, String estado, String funcao) {
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
        System.out.println("------PREFEITO------");
        System.out.println("Nome: "+getNome());
        System.out.println("Partido: "+getPartido());
        System.out.println("Munucipio: "+municipio);
        System.out.println("Estado: "+getEstado());
        System.out.println("Funcao: "+getFuncao());
    }
}
