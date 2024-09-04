package br.edu.fatec.factory;

class Hexagon implements Calculable{
    private Double lado;

    public Hexagon(Double lado){
        this.lado = lado;
    }

    @Override
    public Double calcularArea() {
        return (3 * Math.sqrt(3)/2)*(lado*lado); 
    }
}
