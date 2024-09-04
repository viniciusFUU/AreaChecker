package br.edu.fatec.factory;

public class Triangle implements Calculable{
    private Double base;
    private Double high;

    public Triangle(Double base, Double high){
        this.base = base;
        this.high = high;
    }

    @Override
    public Double calcularArea() {
        return (base * high)/2;
    }
}
