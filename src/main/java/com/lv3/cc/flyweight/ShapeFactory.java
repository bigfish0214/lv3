package com.lv3.cc.flyweight;

import com.lv3.cc.enums.ItemType;
import com.lv3.cc.item.Shape;
import com.lv3.cc.item.impl.Circle;
import com.lv3.cc.item.impl.Rectangle;
import com.lv3.cc.item.impl.Square;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lvhao
 * @date 2019-11-08
 * @description
 **/
public class ShapeFactory {
    private static final Map<Integer, Shape> shapeMap = new HashMap<Integer, Shape>();

    public static Shape getShape(Integer type) {
        Shape shape = shapeMap.get(type);
        if(shape != null) {
            return shape;
        }
        if(type.equals(ItemType.CIRCLE.getType())){
            Shape circle = new Circle();
            shapeMap.put(type, circle);
            System.out.println("create circle");
        } else if(type.equals(ItemType.SQUARE.getType())){
            Shape square = new Square();
            shapeMap.put(type, square);
            System.out.println("create square");
        } else if(type.equals(ItemType.RECTANGLE.getType())) {
            Shape rectangle = new Rectangle();
            shapeMap.put(type, rectangle);
            System.out.println("create rectangle");
        }
        return shapeMap.get(type);

    }
}
