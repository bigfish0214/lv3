package com.lv3.cc.state;

/**
 * @author lvhao
 * @date 2019-11-13
 * @description
 **/
public class StartState implements State {
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }
}
