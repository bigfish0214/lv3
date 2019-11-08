package com.lv3.cc.item;

/**
 * @author lvhao
 * @date 2019-11-08
 * @description
 **/
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}
