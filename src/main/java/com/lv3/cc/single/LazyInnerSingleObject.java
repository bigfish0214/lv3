package com.lv3.cc.single;

/**
 * @author lvhao
 * @date 2019-11-07
 * @description
 **/
public class LazyInnerSingleObject {
    private static class SingletonHolder {
        private static final LazyInnerSingleObject instance = new LazyInnerSingleObject();
    }

    private LazyInnerSingleObject(){}

    public static final LazyInnerSingleObject getInstance() {
        return SingletonHolder.instance;
    }
}
