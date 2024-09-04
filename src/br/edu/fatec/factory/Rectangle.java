package br.edu.fatec.factory;

class Rectangle implements Calculable {
    double lado;
    double altura;

    public Rectangle(double lado, double altura){
        this.lado = lado;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return lado * altura;
    }
}
