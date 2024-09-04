package br.edu.fatec.factory;

class Circle implements Calculable {
    private Double raio;

    public Circle(Double raio){
        this.raio = raio;
    }

    @Override
    public Double calcularArea() {
        return 3.14 * (raio * raio);
    }
}
