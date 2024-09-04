package br.edu.fatec.factory;

class Cube implements Calculable {
    private Double side;

    public Cube(Double side){
        this.side = side;
    }

    @Override
    public Double calcularArea() {
        Square square = new Square(side);
        Double valorQuadrado = square.calcularArea();
        return 6 * valorQuadrado;
    }

}
