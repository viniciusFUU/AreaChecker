package br.edu.fatec.factory;

public class Square implements Calculable {
    private double lado;

    public Square(Double lado){
        this.lado = lado;
    }

    @Override
    public Double calcularArea() {
        return lado * lado;
    }
}
