package com.lv3.cc.main;

import com.lv3.cc.item.Shape;
import com.lv3.cc.item.ShapeDecorator;
import com.lv3.cc.item.impl.Circle;
import com.lv3.cc.item.impl.Rectangle;
import com.lv3.cc.item.impl.RedShapeDecorator;

/**
 * @author lvhao
 * @date 2019-11-08
 * @description
 **/
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        ShapeDecorator redCircle = new RedShapeDecorator(circle);
        ShapeDecorator redRectangle = new RedShapeDecorator(rectangle);

        redCircle.draw();
        redRectangle.draw();
    }

}
