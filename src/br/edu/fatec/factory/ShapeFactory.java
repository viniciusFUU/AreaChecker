package br.edu.fatec.factory;

public interface ShapeFactory {
    Calculable getShape(ShapeType shapeType, Double[] values);
}
