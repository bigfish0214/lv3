package com.lv3.cc.expression;

/**
 * @author lvhao
 * @date 2019-11-13
 * @description
 **/
public class TerminalExpression implements Expression{

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    public boolean interpret(String context) {
        if(context.contains(data)) {
            return true;
        }
        return false;
    }
}
