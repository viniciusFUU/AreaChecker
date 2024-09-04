package br.edu.fatec.factory;

class Square implements Calculable{
    double lado;   
    
    public Square(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
