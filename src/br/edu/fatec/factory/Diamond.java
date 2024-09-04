package br.edu.fatec.factory;

class Diamond implements Calculable{
    private Double baseMaior;
    private Double baseMenor;
    private Double trapezoHigh;
    private Double triangleHigh;

    public Diamond(Double baseMaior, Double baseMenor, Double trapezoHigh, Double triangleHigh){
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.trapezoHigh = trapezoHigh;
        this.triangleHigh = triangleHigh;
    }

    @Override
    public Double calcularArea() {
        Trapezo trapezo = new Trapezo(baseMaior, baseMenor, trapezoHigh);
        Double valorTrapezo = trapezo.calcularArea(); 

        Triangle triangle = new Triangle(baseMaior, triangleHigh);
        Double valorTriangle = triangle.calcularArea();
        return valorTrapezo + valorTriangle;
    }
}
