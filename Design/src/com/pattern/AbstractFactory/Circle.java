package com.pattern.AbstractFactory;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("圆圈里draw()方法");
    }
}
