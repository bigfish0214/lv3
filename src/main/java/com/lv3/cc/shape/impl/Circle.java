package com.lv3.cc.shape.impl;


import com.lv3.cc.shape.DrawAPI;
import com.lv3.cc.shape.Shape;

/**
 * @author lvhao
 * @date 2019-11-07
 * @description
 **/
public class Circle extends Shape {
    private int radius;
    private int x;
    private int y;

    public Circle(DrawAPI drawAPI, int radius, int x, int y) {
        super(drawAPI);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }


    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
