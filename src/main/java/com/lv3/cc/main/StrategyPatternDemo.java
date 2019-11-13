package com.lv3.cc.main;

import com.lv3.cc.strategy.Context;
import com.lv3.cc.strategy.OperationAdd;
import com.lv3.cc.strategy.OperationMultiply;
import com.lv3.cc.strategy.OperationSubstract;

/**
 * @author lvhao
 * @date 2019-11-13
 * @description
 **/
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
