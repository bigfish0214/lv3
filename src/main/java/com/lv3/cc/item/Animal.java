package com.lv3.cc.item;

/**
 * @author lvhao
 * @date 2019-11-07
 * @description
 **/
public abstract class Animal implements Cloneable{

    private Integer type;

    protected String name;

    protected abstract void walk();

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
