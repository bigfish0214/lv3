package com.lv3.cc.expression;

/**
 * @author lvhao
 * @date 2019-11-13
 * @description
 **/
public class AndExpression implements Expression{

    private Expression expr1;

    private Expression expr2;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    public boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}
