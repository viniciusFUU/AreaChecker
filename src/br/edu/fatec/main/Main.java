package br.edu.fatec.main;

import br.edu.fatec.factory.Calculable;
import br.edu.fatec.factory.ShapeFactoryImp;
import br.edu.fatec.factory.ShapeType;

public class Main {
    public static void main(String[] args) {
        ShapeFactoryImp shapeFactoryImp = new ShapeFactoryImp();

        Calculable calcularAreaQuadrado = shapeFactoryImp.getShape(ShapeType.SQUARE, new Double[]{6.0});
        Calculable calcularAreaTriangulo = shapeFactoryImp.getShape(ShapeType.TRIANGLE, new Double[]{6.0, 5.5});
        Calculable calcularAreaRetangulo = shapeFactoryImp.getShape(ShapeType.RECTANGLE, new Double[]{6.0, 5.5});
        Calculable calcularAreaReTrapezio = shapeFactoryImp.getShape(ShapeType.TRAPEZO, new Double[]{6.0, 4.5, 8.0});
        Calculable calcularAreaHexagono = shapeFactoryImp.getShape(ShapeType.HEXAGON, new Double[]{6.0});
        Calculable calcularAreaDiamante = shapeFactoryImp.getShape(ShapeType.DIAMOND,  new Double[]{6.0, 4.5});
        Calculable calcularAreaCubo = shapeFactoryImp.getShape(ShapeType.CUBE,  new Double[]{6.0});
        Calculable calcularAreaCirculo = shapeFactoryImp.getShape(ShapeType.CIRCLE,  new Double[]{7.0});

        System.out.println(calcularAreaQuadrado.calcularArea());
        System.out.println(calcularAreaTriangulo.calcularArea());
        System.out.println(calcularAreaRetangulo.calcularArea());
        System.out.println(calcularAreaReTrapezio.calcularArea());
        System.out.println(calcularAreaHexagono.calcularArea());    
        System.out.println(calcularAreaDiamante.calcularArea());
        System.out.println(calcularAreaCubo.calcularArea());
        System.out.println(calcularAreaCirculo.calcularArea());
    }
}