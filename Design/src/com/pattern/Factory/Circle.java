package com.pattern.Factory;

/**
 * 圆圈实现类
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("圆圈里draw()方法");
    }
}
