package com.lv3.cc.main;

import com.lv3.cc.state.Context;
import com.lv3.cc.state.StartState;
import com.lv3.cc.state.StopState;

/**
 * @author lvhao
 * @date 2019-11-13
 * @description
 **/
public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }
}
