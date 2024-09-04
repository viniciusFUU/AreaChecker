package br.edu.fatec.factory;

class Parallelogram implements Calculable{
    private Double base;
    private Double high;

    public Parallelogram(Double base, Double high){
        this.base = base;
        this.high = high;
    }

    @Override
    public Double calcularArea() {
        return (base * high) / 2;
    }
}
