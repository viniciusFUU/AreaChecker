package br.edu.fatec.factory;

class Trapezo implements Calculable {
    private Double baseMaior;
    private Double baseMenor;
    private Double high;

    public Trapezo(Double baseMaior, Double baseMenor, Double high){
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.high = high;
    }

    @Override
    public Double calcularArea() {
        return ((baseMaior+baseMenor)*high)/2;
    }
}
