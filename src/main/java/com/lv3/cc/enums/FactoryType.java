package com.lv3.cc.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lvhao
 * @date 2019-11-07
 * @description
 **/
public enum FactoryType {
    SHAPEFACTORY(0, "shapeFactory"),
    COLORFACTIRY(1,"ColorFactory");

    private static Map<Integer, FactoryType> lookup = new HashMap<Integer, FactoryType>();

    static {
        for(FactoryType factoryType : EnumSet.allOf(FactoryType.class)) {
            lookup.put(factoryType.type, factoryType);
        }
    }

    private Integer type;

    private String name;

    FactoryType(Integer type, String name) {
        this.type = type;
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static FactoryType get(Integer type) {
        return lookup.get(type);
    }

}
