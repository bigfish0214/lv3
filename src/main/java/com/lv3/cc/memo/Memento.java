package com.lv3.cc.memo;

/**
 * @author lvhao
 * @date 2019-11-13
 * @description
 **/
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
