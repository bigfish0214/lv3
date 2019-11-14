package com.lv3.cc.visit;

/**
 * @author lvhao
 * @date 2019-11-14
 * @description
 **/
public interface ComputerPartVisitor {

    void visit(Keyboard keyboard);

    void visit(Mouse mouse);

    void visit(Monitor monitor);

    void visit(Computer computer);

}
