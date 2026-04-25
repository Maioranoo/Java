/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula7ex8;

/**
 *
 * @author unifjmaiorano
 */
public class Carro {
    private int Velocidade,VelocidadeMaxima ;

    public Carro(int Velocidade, int VelocidadeMaxima) {
        this.Velocidade = Velocidade;
        this.VelocidadeMaxima = VelocidadeMaxima;
        
    }
    
     public int getVelocidade() {
        return Velocidade;
    }

    public void setVelocidade(int VelocidadeMinima) {
        this.Velocidade = Velocidade;
    }

    public int getVelocidadeMaxima() {
        return VelocidadeMaxima;
    }

    public void setVelocidadeMaxima(int VelocidadeMaxima) {
        this.VelocidadeMaxima = VelocidadeMaxima;
    }

   
    
    public void acelerar(int valor){
        if((Velocidade+valor)> VelocidadeMaxima)
            throw new VelocidadeException("Erro: Velocidade nao pode ultrapassar a maxima");
        Velocidade+=valor;
    
    }
    
    public void frear(int valor){
        if((Velocidade-valor)<0)
            throw new VelocidadeException("Erro: Velocidade nao pode ser negativa");
        Velocidade=Velocidade-valor;
    
    }

    @Override
    public String toString() {
        return "Velocidade=" + Velocidade + ", Velocidade Maxima=" + VelocidadeMaxima;
    }
    
    
}
