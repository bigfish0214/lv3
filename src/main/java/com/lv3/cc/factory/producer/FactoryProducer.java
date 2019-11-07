package com.lv3.cc.factory.producer;

import com.lv3.cc.enums.FactoryType;
import com.lv3.cc.factory.AbstractFacotry;
import com.lv3.cc.factory.impl.ColorFactory;
import com.lv3.cc.factory.impl.ShapeFactory;

/**
 * @author lvhao
 * @date 2019-11-07
 * @description
 **/
public class FactoryProducer {

    public static AbstractFacotry getFactory(Integer type) {
        FactoryType factoryType = FactoryType.get(type);
        if(factoryType == null) {
            return null;
        }
        if(factoryType == FactoryType.SHAPEFACTORY) {
            return new ShapeFactory();
        } else if(factoryType == FactoryType.COLORFACTIRY) {
            return new ColorFactory();
        }
        return null;
    }
}
