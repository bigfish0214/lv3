package com.lv3.cc.strategy;

/**
 * @author lvhao
 * @date 2019-11-13
 * @description
 **/
public class OperationSubstract implements Strategy {
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
