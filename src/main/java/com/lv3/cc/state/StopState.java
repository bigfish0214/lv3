package com.lv3.cc.state;

/**
 * @author lvhao
 * @date 2019-11-13
 * @description
 **/
public class StopState implements State {
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}
