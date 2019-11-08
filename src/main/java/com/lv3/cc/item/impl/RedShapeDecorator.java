package com.lv3.cc.item.impl;

import com.lv3.cc.item.Shape;
import com.lv3.cc.item.ShapeDecorator;

/**
 * @author lvhao
 * @date 2019-11-08
 * @description
 **/
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder();
    }

    public void setRedBorder() {
        System.out.println("Bolder color : red");
    }
}
