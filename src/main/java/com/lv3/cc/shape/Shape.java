package com.lv3.cc.shape;

/**
 * @author lvhao
 * @date 2019-11-07
 * @description
 **/
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
