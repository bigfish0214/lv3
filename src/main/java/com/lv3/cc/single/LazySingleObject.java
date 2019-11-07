package com.lv3.cc.single;

/**
 * @author lvhao
 * @date 2019-11-07
 * @description
 **/
public class LazySingleObject {

    private static LazySingleObject instance;

    private LazySingleObject() {

    }

    public static LazySingleObject getInstance() {
        if(instance == null) {
            instance = new LazySingleObject();
        }
        return instance;
    }
}
