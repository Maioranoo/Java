package aula5ex2;

/**
 *
 * @author unifjmaiorano
 */
public class Politico {
    
    private String nome,partido,estado,funcao;

    public Politico() {}

    public Politico(String nome, String partido, String estado, String funcao) {
        this.nome = nome;
        this.partido = partido;
        this.estado = estado;
        this.funcao = funcao;
    }

    public String getNome() {
        return nome;
    }

    public String getPartido() {
        return partido;
    }

    public String getEstado() {
        return estado;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "Politico{" + "nome=" + nome + ", partido=" + partido + ", estado=" + estado + ", funcao=" + funcao + '}';
    }
}
