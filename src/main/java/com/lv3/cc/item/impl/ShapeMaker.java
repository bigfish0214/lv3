package com.lv3.cc.item.impl;

import com.lv3.cc.item.Shape;

/**
 * @author lvhao
 * @date 2019-11-08
 * @description
 **/
public class ShapeMaker {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }

}
