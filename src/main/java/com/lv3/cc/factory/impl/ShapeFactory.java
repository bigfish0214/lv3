package com.lv3.cc.factory.impl;

import com.lv3.cc.enums.ItemType;
import com.lv3.cc.factory.AbstractFacotry;
import com.lv3.cc.item.Color;
import com.lv3.cc.item.Shape;
import com.lv3.cc.item.impl.Circle;
import com.lv3.cc.item.impl.Rectangle;
import com.lv3.cc.item.impl.Square;

/**
 * @author lvhao
 * @date 2019-11-07
 * @description
 **/
public class ShapeFactory extends AbstractFacotry {

    public Shape getShape(Integer type) {
        if(type == null) {
            return null;
        }
        ItemType itemType = ItemType.get(type);
        if(itemType == ItemType.CIRCLE) {
            return new Circle();
        }else if(itemType == ItemType.SQUARE) {
            return new Square();
        }else if(itemType == ItemType.RECTANGLE) {
            return new Rectangle();
        }
        return null;
    }


    public Color getColor(Integer type) {
        return null;
    }
}
