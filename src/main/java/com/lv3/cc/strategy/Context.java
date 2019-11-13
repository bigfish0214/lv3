package com.lv3.cc.strategy;

/**
 * @author lvhao
 * @date 2019-11-13
 * @description
 **/
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
