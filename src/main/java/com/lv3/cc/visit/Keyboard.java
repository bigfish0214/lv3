package com.lv3.cc.visit;

/**
 * @author lvhao
 * @date 2019-11-14
 * @description
 **/
public class Keyboard implements ComputerPart{
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
