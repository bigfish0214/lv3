package com.lv3.cc.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lvhao
 * @date 2019-11-07
 * @description
 **/
public enum ItemType {

    CIRCLE(0, "circle"),
    SQUARE(1,"square"),
    RECTANGLE(2,"rectangle");

    private static Map<Integer, ItemType> lookup = new HashMap<Integer, ItemType>();

    static {
        for (ItemType itemType : EnumSet.allOf(ItemType.class)) {
            lookup.put(itemType.type, itemType);
        }
    }

    private Integer type;

    private String name;

    ItemType(Integer type, String name) {
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

    public static ItemType get(Integer type) {
        return lookup.get(type);
    }
}
