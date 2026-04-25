package aula5ex1;


public class Pessoa {
    
    private String nome,sobrenome;
    private int idade;
    
    public Pessoa(){}
    
    public Pessoa(String nome, String sobrenome, int idade){
        this.nome=nome;
        this.sobrenome=sobrenome;
        this.idade=idade;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", sobrenome=" + sobrenome + ", idade=" + idade + '}';
    }
    
    
}
