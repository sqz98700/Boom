package com.pattern.Factory;

//工厂模式

public class Demo {
    public static void main(String[] args) {
        ShapeFactory sha = new ShapeFactory();
        Shape s1 = sha.getShape("Circle");
        s1.draw();
        Shape s2 = sha.getShape("Rectangle");
        s2.draw();
        Shape s3 = sha.getShape("Square");
        s3.draw();
    }
}
