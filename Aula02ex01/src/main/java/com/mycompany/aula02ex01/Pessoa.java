package com.mycompany.aula02ex01;

public class Pessoa {
    //listar atibutos da classe pessoa
    
    private String nome,cpf;
    private int idade;
    
    //metodos da classe pessoa
    //metodos para retornar o valor dos atributos(get)
    
    public String getNome(){
        return nome;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public int getIdade(){
        return idade;
    }
    
    //metodos para atribuir o valor dos atributos(set)
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public void setCpf(String cpf){
        this.cpf=cpf;
    }
    
    public void setIdade(int idade){
        if(idade<0 || idade>120){
            idade=0;
        }
        this.idade=idade;
    }
  
}
