package com.pattern.Factory;

/**
 * 矩形实现类
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("矩形里边的draw()方法.");
    }
}
