package aula7ex6;

/**
 *
 * @author unifjmaiorano
 */
public class Pessoa {
    private String nome,sobrenome,cpf;
    private int idade;

    public Pessoa(String nome, String sobrenome, String cpf, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        
        if(cpf.contains(".")|| cpf.contains("-"))
            throw new CpfException("Erro: CPF tem . ou -");
        this.cpf=cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", sobrenome=" + sobrenome + ", cpf=" + cpf + ", idade=" + idade;
    }
    
    
}
