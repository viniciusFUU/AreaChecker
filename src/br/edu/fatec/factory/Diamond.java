package br.edu.fatec.factory;

class Diamond implements Calculable{
    private Double diagonalMaior;
    private Double diagonalMenor;

    public Diamond(Double diagonalMaior, Double diagonalMenor){
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
    }

    @Override
    public Double calcularArea() {
        return (diagonalMaior * diagonalMenor)/2;
    }
}
