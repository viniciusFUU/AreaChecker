package br.edu.fatec.factory;

class Rectangle implements Calculable{
    private Double base;
    private Double high;

    public Rectangle(Double base, Double high){
        this.base = base;
        this.high = high;
    }

    @Override
    public Double calcularArea() {
        return base * high;
    }
}
