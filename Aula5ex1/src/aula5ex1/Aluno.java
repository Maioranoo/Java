
package aula5ex1;

/**
 *
 * @author unifjmaiorano
 */
public class Aluno extends Pessoa {
    private String curso;

    public Aluno() {}

    public Aluno(String curso, String nome, String sobrenome, int idade) {
        super(nome, sobrenome, idade);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void print(){
        System.out.println("--------------------");
        System.out.println("Nome: "+getNome());
        System.out.println("Sobrenome: "+getSobrenome());
        System.out.println("Idade: "+getIdade());
        System.out.println("Curso: "+curso);
        System.out.println("--------------------");
    
    }
}