package com.lv3.cc.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lvhao
 * @date 2019-11-07
 * @description
 **/
public enum ColorType {
    RED(0, "red"),
    BLUE(1,"blue"),
    GREEN(2,"green");

    public static Map<Integer, ColorType> lookup = new HashMap<Integer, ColorType>();

    static {
        for(ColorType colorType : EnumSet.allOf(ColorType.class)) {
            lookup.put(colorType.type, colorType);
        }
    }

    private Integer type;

    private String name;

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

    public static ColorType get(Integer type) {
        return lookup.get(type);
    }

    ColorType(Integer type, String name) {
        this.type = type;
        this.name = name;
    }

}
