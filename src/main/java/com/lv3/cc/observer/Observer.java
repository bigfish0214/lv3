package com.lv3.cc.observer;

/**
 * @author lvhao
 * @date 2019-11-13
 * @description
 **/
public abstract class Observer {
    protected Subject subject;
    protected abstract void update();
}
