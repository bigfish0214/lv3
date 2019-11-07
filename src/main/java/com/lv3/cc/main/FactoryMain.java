package com.lv3.cc.main;

import com.lv3.cc.factory.AbstractFacotry;
import com.lv3.cc.factory.producer.FactoryProducer;
import com.lv3.cc.item.Color;
import com.lv3.cc.item.Shape;

/**
 * @author lvhao
 * @date 2019-11-07
 * @description
 **/
public class FactoryMain {
    public static void main(String[] args) {
        AbstractFacotry shapeFactory = FactoryProducer.getFactory(0);
        Shape shape = shapeFactory.getShape(0);
        shape.draw();

        AbstractFacotry colorFactory = FactoryProducer.getFactory(1);
        Color color = colorFactory.getColor(1);
        color.fill();
    }
}
