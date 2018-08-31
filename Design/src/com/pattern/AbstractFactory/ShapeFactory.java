package com.pattern.AbstractFactory;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if (shape.equalsIgnoreCase("Circle")) {
            return new Circle();
        }
        if (shape.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        }
        if (shape.equalsIgnoreCase("Square")) {
            return new Square();
        }

        return null;
    }
}
