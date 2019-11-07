package com.lv3.cc.factory.impl;

import com.lv3.cc.enums.ColorType;
import com.lv3.cc.factory.AbstractFacotry;
import com.lv3.cc.item.Color;
import com.lv3.cc.item.Shape;
import com.lv3.cc.item.impl.Blue;
import com.lv3.cc.item.impl.Green;
import com.lv3.cc.item.impl.Red;

/**
 * @author lvhao
 * @date 2019-11-07
 * @description
 **/
public class ColorFactory extends AbstractFacotry {
    public Shape getShape(Integer type) {
        return null;
    }

    public Color getColor(Integer type) {
        ColorType colorType = ColorType.get(type);
        if(colorType == null) {
            return null;
        }
        Color color = null;
        if(colorType == ColorType.RED) {
            color = new Red();
        }else if(colorType == ColorType.BLUE) {
            color = new Blue();
        }else if(colorType == ColorType.GREEN){
            color = new Green();
        }
        return color;
    }
}
