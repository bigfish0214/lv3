package com.lv3.cc.main;

import com.lv3.cc.item.impl.ShapeMaker;

/**
 * @author lvhao
 * @date 2019-11-08
 * @description
 **/
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
