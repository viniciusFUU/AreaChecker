package br.edu.fatec.factory;

public class ShapeFactoryImp implements ShapeFactory {
    @Override
    public Calculable getShape(ShapeType shapeType, Double[] values) {
        switch (shapeType) {
            case SQUARE:
                return new Square(values[0]);
            case TRIANGLE:
                return new Triangle(values[0], values[1]);
            case RECTANGLE:
                return new Rectangle(values[0], values[1]);
            case PARALLELOGRAM:
                return new Parallelogram(values[0], values[1]);
            case TRAPEZO:
                return new Trapezo(values[0], values[1], values[2]);
            case HEXAGON:
                return new Hexagon(values[0]);
            case DIAMOND:
                return new Diamond(values[0], values[1], values[2], values[3]);
            case CUBE:
                return new Cube(values[0]);
            case CIRCLE:
                return new Circle(values[0]);
            default:
                throw new IllegalArgumentException("Shape type not supported");
        }
    }
}
