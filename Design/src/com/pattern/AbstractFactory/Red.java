package com.pattern.AbstractFactory;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("红色的fill()方法");
    }
}
