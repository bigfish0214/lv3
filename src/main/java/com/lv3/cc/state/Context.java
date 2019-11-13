package com.lv3.cc.state;

/**
 * @author lvhao
 * @date 2019-11-13
 * @description
 **/
public class Context {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }


}
