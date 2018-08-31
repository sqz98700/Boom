package com.pattern.Factory;

/**
 * 正方形实现类
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("正方形里边的draw()方法");
    }
}
