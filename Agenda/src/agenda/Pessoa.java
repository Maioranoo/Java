
package agenda;

public class Pessoa {
    
    private String nome,telefone;
    private int id;
    private static int contador=0;
    
    public Pessoa(String nome,String telefone){
        this.nome=nome;
        this.telefone=telefone;
        this.contador+=1;
        this.id=this.contador;
    }
    
    
    public String getNome(){
        return nome;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
    public int getContador(){
        return contador;
    }
    
    @Override
    public String toString(){
        return "Nome= "+nome +", Telefone="+telefone +", ID="+id;
    }
    
    
    
}
