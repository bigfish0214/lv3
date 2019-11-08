package com.lv3.cc.main;

import com.lv3.cc.enums.ItemType;
import com.lv3.cc.flyweight.ShapeFactory;
import com.lv3.cc.item.Shape;

/**
 * @author lvhao
 * @date 2019-11-08
 * @description
 **/
public class FlyWeightPatternDemo {
    public static void main(String[] args) {
        for(int i=0; i<20; i++){
            Shape shape = ShapeFactory.getShape(getRandomType());
            shape.draw();
        }
    }

    public static Integer getRandomType() {
        return (int)(Math.random() * 3);
    }
}
