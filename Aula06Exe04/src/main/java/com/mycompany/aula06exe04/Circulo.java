package com.mycompany.aula06exe04;

/**
 *
 * @author unifjmaiorano
 */
class Circulo extends Formas {
    private double raio;

    public Circulo() {
    }

    public Circulo(double raio, String tipo) {
        super(tipo);
        this.raio = raio;
    }
    
    @Override
    public double perimetro(){
        return 2*3.14 * raio;
    }
    
    public double area(){
         return 2*3.14 * (raio*raio);
    }
    
    @Override
    public void print(){
            System.out.println("===CIRCULO===");
            System.out.println("RAIO: "+raio);
            System.out.println("PERIMETRO: "+perimetro());
            System.out.println("AREA: "+area());
    }
}