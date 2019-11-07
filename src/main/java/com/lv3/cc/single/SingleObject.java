package com.lv3.cc.single;

/**
 * @author lvhao
 * @date 2019-11-07
 * @description
 **/
public class SingleObject {
    private static SingleObject instance = new SingleObject();

    private SingleObject() {

    }

    public static SingleObject getInstance() {
        return instance;
    }
}
