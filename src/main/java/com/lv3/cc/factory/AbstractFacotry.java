package com.lv3.cc.factory;

import com.lv3.cc.item.Color;
import com.lv3.cc.item.Shape;

/**
 * @author lvhao
 * @date 2019-11-07
 * @description
 **/
public abstract class AbstractFacotry {

    public abstract Shape getShape(Integer type);

    public abstract Color getColor(Integer type);

}
