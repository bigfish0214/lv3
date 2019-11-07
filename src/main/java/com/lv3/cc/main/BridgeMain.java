package com.lv3.cc.main;

import com.lv3.cc.shape.Shape;
import com.lv3.cc.shape.impl.Circle;
import com.lv3.cc.shape.impl.GreenCircle;
import com.lv3.cc.shape.impl.RedCircle;

/**
 * @author lvhao
 * @date 2019-11-07
 * @description
 **/
public class BridgeMain {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedCircle(), 10, 10, 10);
        Shape greenCircle = new Circle(new GreenCircle(),5 ,5,5);
        redCircle.draw();
        greenCircle.draw();
    }
}
